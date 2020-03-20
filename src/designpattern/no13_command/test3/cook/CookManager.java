package designpattern.no13_command.test3.cook;

import designpattern.no13_command.test3.constants.FoodAndCookerConstants;

/**
 * 厨师的管理类
 */
public class CookManager {

    /**
     * 用来控制是否需要创建厨师，
     * 如果已经创建了就不要再执行了
     */
    private static boolean runFlag = false;

    public static BaseCooker getFoodCommand(String foodName) {
        if (!isFoodCanCook(foodName)) {
            return null;
        }

        Integer cookerTag = FoodAndCookerConstants.FOOD_COOKER_MAP.get(foodName);
        BaseCooker cooker;
        if (FoodAndCookerConstants.HOT_COOKER_TAG.equals(cookerTag)) {
            cooker = new HotCooker();
        } else {
            cooker = new CoolCooker();
        }
        return cooker;
    }

    public static boolean isFoodCanCook(String foodName) {
        return FoodAndCookerConstants.FOOD_COOKER_MAP.containsKey(foodName);
    }

    public static void runCookManager() {
        if (!runFlag) {
            runFlag = true;

            HotCooker hotCooker = new HotCooker();
            CoolCooker coolCooker = new CoolCooker();

            Thread hotCookerThread = new Thread(hotCooker);
            Thread coolCookerThread = new Thread(coolCooker);

            hotCookerThread.start();
            coolCookerThread.start();
        }
    }

}
