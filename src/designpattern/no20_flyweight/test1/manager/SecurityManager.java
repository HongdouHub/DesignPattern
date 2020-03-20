package designpattern.no20_flyweight.test1.manager;

import designpattern.no20_flyweight.test1.bean.AuthorityBean;
import designpattern.no20_flyweight.test1.dao.AuthorityDao;
import designpattern.no20_flyweight.test1.dao.file.FileAuthorityDaoImpl;
import utils.TextUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityManager {

    private Map<String, Collection<AuthorityBean>> map;

    private SecurityManager() {
        map = new HashMap<String, Collection<AuthorityBean>>();
    }

    public static SecurityManager getInstance() {
        return SecurityManagerHolder.instance;
    }

    public void login(String userName) {
        Collection<AuthorityBean> collection = queryByUserName(userName);
        map.put(userName, collection);
    }

    private Collection<AuthorityBean> queryByUserName(String userName) {
        AuthorityDao dao = new FileAuthorityDaoImpl();
//        AuthorityDao dao = new RdbAuthorityDaoImpl();
        return dao.queryAuthorityByUserName(userName);
    }

    public boolean hasPermission(AuthorityBean authorityBean) {
        if (authorityBean == null) {
            System.err.println("校验信息有误");
            return false;
        }
        Collection<AuthorityBean> authorityBeans = map.get(authorityBean.getUserName());
        if (authorityBeans == null || authorityBeans.size() == 0) {
            System.err.println("没有登陆或者没有被分配任何权限");
            return false;
        }
        for (AuthorityBean bean : authorityBeans) {
            if (TextUtils.equals(bean.getAuthorityEntity(), authorityBean.getAuthorityEntity()) &&
                    TextUtils.equals(bean.getAuthorityType(), authorityBean.getAuthorityType())) {
                return true;
            }
        }
        return false;
    }

    private static class SecurityManagerHolder {
        private static SecurityManager instance = new SecurityManager();
    }

}
