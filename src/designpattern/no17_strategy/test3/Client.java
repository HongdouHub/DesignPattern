package designpattern.no17_strategy.test3;

public class Client {

    /**
     * 策略模式的本质：分离算法，选择实现
     */
    public static void main(String[] args) {
        Price price = new Price(new LargeStrategy());
        double quote = price.quote(1000);
        System.out.println("报价：" + quote);
    }
}
