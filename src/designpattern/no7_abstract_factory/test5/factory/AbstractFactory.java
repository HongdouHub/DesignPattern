package designpattern.no7_abstract_factory.test5.factory;

import designpattern.no7_abstract_factory.test5.detaildao.OrderDetailDAO;
import designpattern.no7_abstract_factory.test5.maindao.OrderMainDAO;

public interface AbstractFactory {

    /**
     * 创建订单主记录对应的DAO对象
     * @return
     */
    OrderMainDAO createOrderMainDAO();

    /**
     * 创建订单子记录对应的DAO对象
     * @return
     */
    OrderDetailDAO createOrderDetailDAO();
}
