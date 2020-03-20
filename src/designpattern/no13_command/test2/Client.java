package designpattern.no13_command.test2;

import designpattern.no13_command.test2.waiter.Waiter;

public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        waiter.order("绿豆排骨煲");
        waiter.order("北京烤鸭");
        waiter.order("凉菜蒜泥白肉");

        waiter.orderOver();
    }
}
