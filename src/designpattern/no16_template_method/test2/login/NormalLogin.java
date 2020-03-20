package designpattern.no16_template_method.test2.login;

import designpattern.no16_template_method.test2.bean.LoginModel;

/**
 * 普通用户登陆控制的逻辑处理
 */
public class NormalLogin extends LoginTemplate {

    @Override
    protected LoginModel findLoginUser(String loginId) {
        LoginModel model = new LoginModel();
        model.setLoginId(loginId);
        model.setPwd("testPwd");
        return model;
    }
}
