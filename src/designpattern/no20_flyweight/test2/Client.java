package designpattern.no20_flyweight.test2;

import designpattern.no20_flyweight.test2.manager.SecurityManager;

public class Client {

    /**
     * 考虑：
     *      1. 缓存时间长度问题；
     *      2. 缓存数据和真实数据的同步问题；
     *      3. 缓存的多线程并发问题
     *
     * 目的：
     *      1. 减少对象的数量
     *      2. 节约内存
     *      3. 内部状态 & 外部状态
     *      4. 享元工厂（享元对象的实例池）
     */
    public static void main(String[] args) {
        SecurityManager manager = SecurityManager.getInstance();
        manager.login("张三");
        manager.login("李四");

        boolean f1 = manager.hasPermit("张三", "薪资列表", "查看");
        boolean f2 = manager.hasPermit("李四", "薪资列表", "查看");

        System.out.println("张三 - 薪资列表 - 查看 : " + f1);
        System.out.println("李四 - 薪资列表 - 查看 : " + f2);

        for (int i = 0; i < 3; i ++) {
            manager.login("张三" + i);
            boolean b = manager.hasPermit("张三" + i, "薪资列表", "查看");
            System.out.println("张三" + i + " - 薪资列表 - 查看 : " + b);
        }
    }
}
