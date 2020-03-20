package designpattern.no7_abstract_factory.test2;

import designpattern.no7_abstract_factory.test2.factory.AbstractFactory;
import designpattern.no7_abstract_factory.test2.factory.Schema2;

public class Client {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();

        AbstractFactory schema = new Schema2();
        engineer.makeComputer(schema);
    }

}
