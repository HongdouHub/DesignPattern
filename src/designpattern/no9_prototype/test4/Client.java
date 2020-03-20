package designpattern.no9_prototype.test4;

public class Client {
    private static final String KEY_1 = "111";
    private static final String KEY_2 = "222";
    private static final String KEY_EMPTY = "333";

    public static void main(String[] args) {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        concretePrototype1.setName("Client1");
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        concretePrototype2.setName("Client2");
        concretePrototype2.setAge("20");

        PrototypeManager manager = PrototypeManager.getInstance();
        manager.addPrototype(KEY_1, concretePrototype1);
        manager.addPrototype(KEY_2, concretePrototype2);

        ConcretePrototype1 prototype1 = (ConcretePrototype1) manager.getPrototype(KEY_1);
        prototype1.setName("ConcretePrototype1");
        System.out.println("prototype1:" + prototype1);

        ConcretePrototype1 prototype2 = (ConcretePrototype1) manager.getPrototype(KEY_1);
        System.out.println("prototype2:" + prototype2);

        ConcretePrototype2 prototype = (ConcretePrototype2) manager.getPrototype(KEY_2);

        System.out.println("prototype:" + concretePrototype1);
        System.out.println("prototype:" + prototype);

        delayGetEmptyBean();
    }

    private static void delayGetEmptyBean() {
        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ConcretePrototype1 prototype3 = (ConcretePrototype1) PrototypeManager.getInstance().getPrototype(KEY_EMPTY);
            System.out.println(prototype3);
        }).start();

    }
}
