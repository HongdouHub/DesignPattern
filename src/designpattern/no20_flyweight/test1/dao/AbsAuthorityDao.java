package designpattern.no20_flyweight.test1.dao;

import designpattern.no20_flyweight.test1.bean.AuthorityBean;
import utils.TextUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsAuthorityDao implements AuthorityDao {

    protected static List<AuthorityBean> raw = new ArrayList<AuthorityBean>();

    static {
        raw.add(new AuthorityBean("张三", "人员列表", "查看"));
        raw.add(new AuthorityBean("李四", "人员列表", "查看"));
        raw.add(new AuthorityBean("王五", "人员列表", "查看"));
        raw.add(new AuthorityBean("赵六", "人员列表", "查看"));
        raw.add(new AuthorityBean("李四", "薪资数据", "查看"));
        raw.add(new AuthorityBean("李四", "薪资数据", "修改"));
    }

    protected List<AuthorityBean> authorityList = new ArrayList<AuthorityBean>();

    @Override
    public List<AuthorityBean> queryAuthorityByUserName(String userName) {
        List<AuthorityBean> list = new ArrayList<>();
        for (AuthorityBean bean : authorityList) {
            if (TextUtils.equals(bean.getUserName(), userName)) {
                list.add(bean);
            }
        }
        return list;
    }

    protected AuthorityBean queryAuthority(AuthorityBean authorityBean) {
        for (AuthorityBean bean : authorityList) {
            if (TextUtils.equals(bean.getUserName(), authorityBean.getUserName()) &&
                    TextUtils.equals(bean.getAuthorityEntity(), authorityBean.getAuthorityEntity()) &&
                    TextUtils.equals(bean.getAuthorityType(), authorityBean.getAuthorityType())) {
                return bean;
            }
        }
        return null;
    }

    @Override
    public synchronized boolean saveAuthority(AuthorityBean authority) {
        if (authority == null) {
            return false;
        }

        AuthorityBean authorityBean = queryAuthority(authority);
        if (authorityBean == null) { // 不存在
            authorityList.add(authority);
        } else {
            int index = authorityList.indexOf(authorityBean);
            authorityList.set(index, authorityBean);
        }
        save();
        return true;
    }

    @Override
    public synchronized AuthorityBean removeAuthority(AuthorityBean authority) {
        AuthorityBean authorityBean = queryAuthority(authority);
        if (authorityBean == null) { // 不存在
            return null;
        }
        authorityList.remove(authorityBean);
        save();
        return authorityBean;
    }

    protected abstract void save();
}
