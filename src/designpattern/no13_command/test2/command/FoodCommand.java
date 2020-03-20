package designpattern.no13_command.test2.command;

import designpattern.no13_command.test2.cook.CookApi;

public class FoodCommand implements Command {

    /**
     * 持有厨师的对象
     */
    private CookApi cooker = null;

    /**
     * 菜的名字
     */
    private String foodName;

    public FoodCommand(CookApi cook, String foodName) {
        this.cooker = cook;
        this.foodName = foodName;
    }

    public CookApi getCooker() {
        return cooker;
    }

    public void setCooker(CookApi cooker) {
        this.cooker = cooker;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public void execute() {
        cooker.cook(foodName);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + ((cooker == null) ? 0 : cooker.hashCode());
        result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
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
        FoodCommand detailBean = (FoodCommand) obj;
        return detailBean.getCooker().equals(cooker) &&
                detailBean.getFoodName().equals(foodName);
    }
}
