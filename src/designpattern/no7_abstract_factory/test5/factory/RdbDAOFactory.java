package designpattern.no7_abstract_factory.test5.factory;

import designpattern.no7_abstract_factory.test5.detaildao.OrderDetailDAO;
import designpattern.no7_abstract_factory.test5.detaildao.RdbDetailDAOImpl;
import designpattern.no7_abstract_factory.test5.maindao.OrderMainDAO;
import designpattern.no7_abstract_factory.test5.maindao.RdbMainDAOImpl;

public class RdbDAOFactory implements AbstractFactory {

    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
