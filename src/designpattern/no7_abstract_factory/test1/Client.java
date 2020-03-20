package designpattern.no7_abstract_factory.test1;

public class Client {
    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        engineer.makeComputer(1, 1);
    }
}
