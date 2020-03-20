package designpattern.no17_strategy.test1;

import designpattern.no17_strategy.constants.BusinessConstants;

public class Price {

    public double quote(double goodsPrice, String customerType) {
        switch (customerType) {
            case BusinessConstants.USER_TYPE_OLD:
                System.out.println("老客户-折扣5%");
                return goodsPrice * (1 - 0.05);
            case BusinessConstants.USER_TYPE_LARGE:
                System.out.println("大客户-折扣10%");
                return goodsPrice * (1 - 0.1);
            case BusinessConstants.USER_TYPE_NORMAL:
            default:
                System.out.println("没有折扣");
                return goodsPrice;
        }
    }
}
