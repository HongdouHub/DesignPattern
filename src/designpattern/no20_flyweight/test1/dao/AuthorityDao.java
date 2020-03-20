package designpattern.no20_flyweight.test1.dao;

import designpattern.no20_flyweight.test1.bean.AuthorityBean;

import java.util.List;

public interface AuthorityDao {

    /**
     * 查询符合用户信息的权限列表
     */
    List<AuthorityBean> queryAuthorityByUserName(String userName);

    /**
     * 保存权限信息
     */
    boolean saveAuthority(AuthorityBean authority);

    /**
     * 根据用户名称移除对应的权限信息
     */
    AuthorityBean removeAuthority(AuthorityBean authority);

}
