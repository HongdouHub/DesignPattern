package designpattern.no20_flyweight.test1.bean;

public class AuthorityBean {

    private String userName;        // 用户名称
    private String authorityEntity; // 权限实体
    private String authorityType;   // 权限类型

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAuthorityEntity() {
        return authorityEntity;
    }

    public void setAuthorityEntity(String authorityEntity) {
        this.authorityEntity = authorityEntity;
    }

    public String getAuthorityType() {
        return authorityType;
    }

    public void setAuthorityType(String authorityType) {
        this.authorityType = authorityType;
    }

    public AuthorityBean() {
        //
    }

    public AuthorityBean(String userName, String authorityEntity, String authorityType) {
        this.userName = userName;
        this.authorityEntity = authorityEntity;
        this.authorityType = authorityType;
    }

    @Override
    public String toString() {
        return userName + " 对 " + authorityEntity + " 拥有 " + authorityType + "的权限";
    }
}
