package designpattern.no17_strategy.test3;

public class OldStrategy implements Strategy {
    @Override
    public double calculatePrice(double goodsPrice) {
        System.out.println("老客户-折扣5%");
        return goodsPrice * (1 - 0.05);
    }
}
