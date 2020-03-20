package designpattern.no7_abstract_factory.test5.factory;

import designpattern.no7_abstract_factory.test5.detaildao.OrderDetailDAO;
import designpattern.no7_abstract_factory.test5.detaildao.XmlDetailDAOImpl;
import designpattern.no7_abstract_factory.test5.maindao.OrderMainDAO;
import designpattern.no7_abstract_factory.test5.maindao.XmlMainDAOImpl;

public class XmlDAOFactory implements AbstractFactory {
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}
