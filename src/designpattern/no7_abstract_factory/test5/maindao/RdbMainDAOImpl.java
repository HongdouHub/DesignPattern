package designpattern.no7_abstract_factory.test5.maindao;

public class RdbMainDAOImpl implements OrderMainDAO {

    @Override
    public void saveOrderMain() {
        System.out.println("RdbMainDAOImpl : saveOrderMain");
    }
}
