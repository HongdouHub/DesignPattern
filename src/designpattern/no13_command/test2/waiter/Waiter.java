package designpattern.no13_command.test2.waiter;

import designpattern.no13_command.test2.command.FoodCommand;
import designpattern.no13_command.test2.command.MenuCommand;
import designpattern.no13_command.test2.cook.CookApi;
import designpattern.no13_command.test2.cook.CookManager;

/**
 * 服务员，负责组合菜单，负责组装每个菜和具体的实现者
 */
public class Waiter {

    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 客户点菜
     */
    public boolean order(String dishName) {
        CookApi cooker = CookManager.getFoodCommand(dishName);
        if (cooker == null) {
            return false;
        }

        FoodCommand command = new FoodCommand(cooker, dishName);
        menuCommand.addCommand(command);
        return true;
    }

    public boolean cancel(String dishName) {
        CookApi cooker = CookManager.getFoodCommand(dishName);
        if (cooker == null) {
            return false;
        }
        FoodCommand command = new FoodCommand(cooker, dishName);
        return menuCommand.removeCommand(command);
    }

    public void orderOver() {
        menuCommand.execute();
    }
}
