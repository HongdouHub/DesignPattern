package designpattern.no17_strategy.test3;

public class CooperStrategy implements Strategy {
    @Override
    public double calculatePrice(double goodsPrice) {
        System.out.println("合作伙伴-折扣20%");
        return goodsPrice * (1 - 0.2);
    }
}
