package designpattern.no17_strategy.test3;

public class NormalStrategy implements Strategy {
    @Override
    public double calculatePrice(double goodsPrice) {
        System.out.println("没有折扣");
        return goodsPrice;
    }
}
