package designpattern.no16_template_method.test2.login;

import designpattern.no16_template_method.test2.bean.LoginModel;

public abstract class LoginTemplate {

    public final boolean login(LoginModel model) {
        LoginModel dbModel = findLoginUser(model.getLoginId());

        if (dbModel != null) {
            String encryptPwd = encryptPwd(model.getPwd());
            model.setPwd(encryptPwd);
            return match(model, dbModel);
        }
        return false;
    }

    protected String encryptPwd(String pwd) {
        return pwd;
    }

    protected abstract LoginModel findLoginUser(String loginId);

    private boolean match(LoginModel model, LoginModel dbModel) {
        if (model == null && dbModel == null) {
            return true;
        }
        return model != null && model.equals(dbModel);
    }
}
