package designpattern.no20_flyweight.test2.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {

    private Map<String, Flyweight> fsMap = new HashMap<String, Flyweight>();

    public static FlyweightFactory getInstance() {
        return FlyweightFactoryHolder.instance;
    }

    /**
     * 通过key获取对应的享元对象
     */
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = fsMap.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            fsMap.put(key, flyweight);
        }
        return flyweight;
    }



    private static class FlyweightFactoryHolder {
        private static FlyweightFactory instance = new FlyweightFactory();
    }
}
