package designpattern.no7_abstract_factory.test5.detaildao;

public class RdbDetailDAOImpl implements OrderDetailDAO {

    @Override
    public void saveOrderDetail() {
        System.out.println("RdbDetailDAOImpl : saveOrderDetail");
    }
}
