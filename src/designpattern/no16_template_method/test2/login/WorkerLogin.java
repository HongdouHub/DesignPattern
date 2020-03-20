package designpattern.no16_template_method.test2.login;

import designpattern.no16_template_method.test2.bean.LoginModel;

/**
 * 工作人员登陆控制的逻辑处理
 */
public class WorkerLogin extends LoginTemplate {

    @Override
    protected LoginModel findLoginUser(String loginId) {
        LoginModel model = new LoginModel();
        model.setLoginId(loginId);
        model.setPwd("workerPwd");
        return model;
    }

    @Override
    protected String encryptPwd(String pwd) {
        System.out.println("使用MD5进行密码加密");
        return pwd;
    }
}
