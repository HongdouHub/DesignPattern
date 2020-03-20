package designpattern.no13_command.test2.cook;

import designpattern.no13_command.test2.constants.FoodAndCookerConstants;

/**
 * 厨师的管理类
 */
public class CookManager {

    public static CookApi getFoodCommand(String foodName) {
        if (!isFoodCanCook(foodName)) {
            return null;
        }

        Integer cookerTag = FoodAndCookerConstants.FOOD_COOKER_MAP.get(foodName);
        CookApi cooker = null;
        if (FoodAndCookerConstants.HOT_COOK_TAG.equals(cookerTag)) {
            cooker = new HotCook();
        } else {
            cooker = new CoolCook();
        }
        return cooker;
    }

    public static boolean isFoodCanCook(String foodName) {
        return FoodAndCookerConstants.FOOD_COOKER_MAP.containsKey(foodName);
    }

}
