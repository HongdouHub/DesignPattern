package designpattern.no20_flyweight.test1;

import designpattern.no20_flyweight.test1.bean.AuthorityBean;
import designpattern.no20_flyweight.test1.manager.SecurityManager;

public class Client {

    public static void main(String[] args) {
        SecurityManager manager = SecurityManager.getInstance();
        manager.login("张三");
        manager.login("李四");

        AuthorityBean bean = new AuthorityBean("张三", "薪资数据", "查看");
        AuthorityBean bean1 = new AuthorityBean("李四", "薪资数据", "查看");

        System.out.println(bean + " -是否有权限： " + manager.hasPermission(bean));
        System.out.println(bean1 + " -是否有权限： " + manager.hasPermission(bean1));
    }
}
