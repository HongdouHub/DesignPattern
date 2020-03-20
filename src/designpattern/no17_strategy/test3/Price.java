package designpattern.no17_strategy.test3;

public class Price {

    private Strategy strategy = null;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice) {
        return strategy.calculatePrice(goodsPrice);
    }
}
