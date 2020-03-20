package designpattern.no16_template_method.test2.login;

import designpattern.no16_template_method.test2.bean.LoginModel;
import designpattern.no16_template_method.test2.bean.NormalLoginModel;

public class NormalLogin2 extends LoginTemplate {

    @Override
    protected LoginModel findLoginUser(String loginId) {
        NormalLoginModel model = new NormalLoginModel();
        model.setLoginId(loginId);
        model.setPwd("testPwd");
        model.setQuestion("testQuestion");
        model.setAnswer("testAnswer");
        return model;
    }

    // 不能被调用，原因：父类中的方法是private的
    public boolean match(LoginModel model, LoginModel dbModel) {
        System.out.println("NormalLogin2: match getThread1");
        if (model == null && dbModel == null) {
            return true;
        }
        return model != null && model.equals(dbModel);
    }
}
