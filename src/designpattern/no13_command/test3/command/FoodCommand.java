package designpattern.no13_command.test3.command;

import com.sun.istack.internal.NotNull;
import designpattern.no13_command.test3.cook.BaseCooker;

public class FoodCommand implements Command {

    /**
     * 持有厨师的对象
     */
    private BaseCooker cooker;

    /**
     * 菜的名字
     */
    private String foodName;

    /**
     * 点菜的桌号
     */
    private int tableNum;

    public FoodCommand(@NotNull String foodName, int tableNum, @NotNull BaseCooker cook) {
        this.foodName = foodName;
        this.tableNum = tableNum;
        this.cooker = cook;
    }

    @Override
    public void execute() {
        cooker.cook(tableNum, foodName);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + ((cooker == null) ? 0 : cooker.hashCode());
        result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
        result = prime * result + tableNum;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FoodCommand)) {
            return false;
        }
        FoodCommand command = (FoodCommand) obj;
        return command.getCooker().equals(cooker) &&
                command.getFoodName().equals(foodName) &&
                command.getTableNum() == tableNum;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public BaseCooker getCooker() {
        return cooker;
    }

    public void setCooker(BaseCooker cooker) {
        this.cooker = cooker;
    }
}
