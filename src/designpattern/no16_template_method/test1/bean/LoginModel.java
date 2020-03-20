package designpattern.no16_template_method.test1.bean;

import utils.TextUtils;

/**
 * 封装进行登陆控制所需要的数据
 */
public class LoginModel {

    /**
     * 登陆人员的编号
     */
    private String loginId;

    /**
     * 登陆的密码
     */
    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + (loginId == null ? 0 : loginId.hashCode());
        result = prime * result + (pwd == null ? 0 : pwd.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof LoginModel)) {
            return false;
        }
        LoginModel model = (LoginModel) obj;
        return TextUtils.equals(model.getPwd(), pwd) && TextUtils.equals(model.getLoginId(), loginId);
    }
}
