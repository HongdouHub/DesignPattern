package designpattern.no17_strategy.test2;

import designpattern.no17_strategy.constants.BusinessConstants;

public class Price {

    public double quote(double goodsPrice, String customerType) {
        switch (customerType) {
            case BusinessConstants.USER_TYPE_NORMAL:
                return calculatePriceForNormal(goodsPrice);
            case BusinessConstants.USER_TYPE_OLD:
                return calculatePriceForOld(goodsPrice);
            case BusinessConstants.USER_TYPE_LARGE:
                return calculatePriceForLarge(goodsPrice);
            default:
                return goodsPrice;
        }
    }

    private double calculatePriceForNormal(double goodsPrice) {
        System.out.println("没有折扣");
        return goodsPrice;
    }

    private double calculatePriceForOld(double goodsPrice) {
        System.out.println("老客户-折扣5%");
        return goodsPrice * (1 - 0.05);
    }


    private double calculatePriceForLarge(double goodsPrice) {
        System.out.println("大客户-折扣10%");
        return goodsPrice * (1 - 0.1);
    }
}
