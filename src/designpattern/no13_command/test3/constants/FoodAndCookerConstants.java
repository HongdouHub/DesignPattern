package designpattern.no13_command.test3.constants;

import java.util.HashMap;
import java.util.Map;

public class FoodAndCookerConstants {

    private FoodAndCookerConstants() {
        //
    }

    /**
     * 热菜厨师的标记
     */
    public static final Integer HOT_COOKER_TAG = 1;

    /**
     * 凉菜厨师的标记
     */
    public static final Integer COOL_COOKER_TAG = 2;

    public static final Map<String, Integer> FOOD_COOKER_MAP = new HashMap<String, Integer>() {
        {
            put("北京烤鸭", HOT_COOKER_TAG);
            put("绿豆排骨煲", HOT_COOKER_TAG);
            put("凉菜蒜泥白肉", COOL_COOKER_TAG);
        }
    };
}
