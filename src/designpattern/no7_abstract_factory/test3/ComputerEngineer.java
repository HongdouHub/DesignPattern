package designpattern.no7_abstract_factory.test3;

import designpattern.no7_abstract_factory.test3.cpu.CPUApi;
import designpattern.no7_abstract_factory.test3.factory.AbstractFactory;
import designpattern.no7_abstract_factory.test3.mainboard.MainBoardApi;

public class ComputerEngineer {

    private CPUApi cpu = null;

    private MainBoardApi mainBoard = null;

    public void makeComputer(AbstractFactory schema) {
        // 1.准备装机配件
        prepareHardWares(schema);
        // 2.组装机器
        // 3.测试机器
        // 4.交付客户
    }

    private void prepareHardWares(AbstractFactory schema) {
        cpu = (CPUApi) schema.createProduct(1);
        mainBoard = (MainBoardApi) schema.createProduct(2);

        cpu.calculate();
        mainBoard.installCPU();
    }

}
