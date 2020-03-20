package designpattern.no16_template_method.test1;

import designpattern.no16_template_method.test1.bean.LoginModel;
import designpattern.no16_template_method.test1.login.LoginTemplate;
import designpattern.no16_template_method.test1.login.NormalLogin;
import designpattern.no16_template_method.test1.login.WorkerLogin;

public class Client {

    public static void main(String[] args) {
        LoginModel model = new LoginModel();
        model.setLoginId("admin");
        model.setPwd("testPwd");

        LoginTemplate login1 = new WorkerLogin();
        LoginTemplate login2 = new NormalLogin();

        boolean isLogin1 = login1.login(model);
        System.out.println("可以登陆工作平台:" + isLogin1);

        boolean isLogin2 = login2.login(model);
        System.out.println("可以登陆普通人员平台:" + isLogin2);
    }

}
