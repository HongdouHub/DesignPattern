package designpattern.no16_template_method.test2;

import designpattern.no16_template_method.test2.bean.NormalLoginModel;
import designpattern.no16_template_method.test2.login.NormalLogin2;

public class Client {

    public static void main(String[] args) {
        NormalLoginModel model = new NormalLoginModel();
        model.setLoginId("loginId");
        model.setPwd("testPwd");
        model.setQuestion("testQuestion");
        model.setAnswer("testAnswer");

        NormalLogin2 login2 = new NormalLogin2();
        boolean flag = login2.login(model);
        System.out.println("可以进行普通人员加强版登陆:" + flag);
    }
}
