package designpattern.no7_abstract_factory.test5;

import designpattern.no7_abstract_factory.test5.detaildao.OrderDetailDAO;
import designpattern.no7_abstract_factory.test5.factory.RdbDAOFactory;
import designpattern.no7_abstract_factory.test5.factory.XmlDAOFactory;
import designpattern.no7_abstract_factory.test5.maindao.OrderMainDAO;

public class Client {

    public static void main(String[] args) {
        RdbDAOFactory rdbDAOFactory = new RdbDAOFactory();
        OrderMainDAO mainRdbDAO = rdbDAOFactory.createOrderMainDAO();
        OrderDetailDAO detailRdbDAO = rdbDAOFactory.createOrderDetailDAO();
        mainRdbDAO.saveOrderMain();
        detailRdbDAO.saveOrderDetail();

        System.out.println("------------");

        XmlDAOFactory xmlDAOFactory = new XmlDAOFactory();
        OrderMainDAO mainXmlDAO = xmlDAOFactory.createOrderMainDAO();
        OrderDetailDAO detailXmlDAO = xmlDAOFactory.createOrderDetailDAO();
        mainXmlDAO.saveOrderMain();
        detailXmlDAO.saveOrderDetail();

    }
}
