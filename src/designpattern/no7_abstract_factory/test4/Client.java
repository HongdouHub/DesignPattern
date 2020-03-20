package designpattern.no7_abstract_factory.test4;

import designpattern.no7_abstract_factory.test4.factory.AbstractFactory;
import designpattern.no7_abstract_factory.test4.factory.Schema3;

public class Client {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();

        AbstractFactory schema = new Schema3();
        engineer.makeComputer(schema);
    }

}
