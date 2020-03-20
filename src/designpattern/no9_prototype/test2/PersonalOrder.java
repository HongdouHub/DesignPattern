package designpattern.no9_prototype.test2;

public class PersonalOrder implements Cloneable, OrderApi {

    private int orderNum;

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "orderNum=" + orderNum +
                '}';
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("PersonalOrder CloneNotSupportedException:" + e);
        }
        return object;
    }
}
