package designpattern.no13_command.test3;

import designpattern.no13_command.test3.cook.CookManager;
import designpattern.no13_command.test3.waiter.Waiter;

public class Client {

    private static final String WARNING = "没有这道菜";

    public static void main(String[] args) {
        CookManager.runCookManager();
        Waiter waiter = new Waiter();

        for (int tableNum = 0; tableNum < 3; tableNum++) {
            if (!waiter.order("米饭", tableNum)) {
                System.err.println(WARNING);
            }

            waiter.order("绿豆排骨煲", tableNum);
            waiter.order("北京烤鸭", tableNum);
            waiter.order("凉菜蒜泥白肉", tableNum);

            if (tableNum == 2) {
                waiter.orderOver();
                continue;
            }

            if (waiter.cancel("绿豆排骨煲", tableNum)) {
                System.out.println("取消绿豆排骨煲 - 成功");
            } else {
                System.out.println("取消绿豆排骨煲 - 失败");
            }
            waiter.orderOver();
        }
    }
}
