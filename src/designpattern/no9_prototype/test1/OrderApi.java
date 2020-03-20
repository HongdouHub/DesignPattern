package designpattern.no9_prototype.test1;

public interface OrderApi {

    int getOrderNum();

    void setOrderNum(int num);

    OrderApi cloneOrder();
}
