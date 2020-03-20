package designpattern.no9_prototype.test1;

public class PersonalOrder implements OrderApi {

    private int orderNum;

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public void setOrderNum(int num) {
        this.orderNum = num;
    }

    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setOrderNum(orderNum);
        return order;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "orderNum=" + orderNum +
                '}';
    }
}
