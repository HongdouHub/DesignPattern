package designpattern.no7_abstract_factory.test3;

import designpattern.no7_abstract_factory.test3.factory.AbstractFactory;
import designpattern.no7_abstract_factory.test3.factory.Schema1;

public class Client {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();

        AbstractFactory schema = new Schema1();
        engineer.makeComputer(schema);
    }

}
