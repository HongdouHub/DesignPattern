package designpattern.no9_prototype.test1;

public class Client {

    public static void main(String[] args) {
        PersonalOrder order = new PersonalOrder();
        order.setOrderNum(100);
        System.out.println(order);

        PersonalOrder order1 = (PersonalOrder) order.cloneOrder();
        order1.setOrderNum(50);
        System.out.println(order1);

        System.out.println(order);

    }

}
