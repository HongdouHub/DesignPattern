package designpattern.no7_abstract_factory.test5.maindao;

public class XmlMainDAOImpl implements OrderMainDAO {

    @Override
    public void saveOrderMain() {
        System.out.println("XmlMainDAOImpl : saveOrderMain");
    }
}
