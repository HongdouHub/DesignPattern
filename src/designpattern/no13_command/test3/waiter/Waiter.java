package designpattern.no13_command.test3.waiter;

import designpattern.no13_command.test3.command.FoodCommand;
import designpattern.no13_command.test3.command.MenuCommand;
import designpattern.no13_command.test3.cook.BaseCooker;
import designpattern.no13_command.test3.cook.CookManager;

/**
 * 服务员，负责组合菜单，负责组装每个菜和具体的实现者
 */
public class Waiter {

    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 客户点菜
     */
    public boolean order(String dishName, int tableNum) {
        boolean canCook = CookManager.isFoodCanCook(dishName);
        if (!canCook) {
            return false;
        }

        BaseCooker cooker = CookManager.getFoodCommand(dishName);
        if (cooker == null) {
            return false;
        }

        FoodCommand command = new FoodCommand(dishName, tableNum, cooker);
        menuCommand.addCommand(command);
        return true;
    }

    public boolean cancel(String dishName, int tableNum) {
        BaseCooker cooker = CookManager.getFoodCommand(dishName);
        if (cooker == null) {
            return false;
        }
        FoodCommand command = new FoodCommand(dishName, tableNum, cooker);
        return menuCommand.removeCommand(command);
    }

    public void orderOver() {
        menuCommand.execute();
    }
}
