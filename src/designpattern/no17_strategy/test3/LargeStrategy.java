package designpattern.no17_strategy.test3;

public class LargeStrategy implements Strategy {
    @Override
    public double calculatePrice(double goodsPrice) {
        System.out.println("大客户-折扣10%");
        return goodsPrice * (1 - 0.1);
    }
}
