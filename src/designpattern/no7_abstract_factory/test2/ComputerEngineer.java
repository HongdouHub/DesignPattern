package designpattern.no7_abstract_factory.test2;

import designpattern.no7_abstract_factory.test2.cpu.CPUApi;
import designpattern.no7_abstract_factory.test2.factory.AbstractFactory;
import designpattern.no7_abstract_factory.test2.mainboard.MainBoardApi;

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
        cpu = schema.createCPUApi();
        mainBoard = schema.createMainBoardApi();

        cpu.calculate();
        mainBoard.installCPU();
    }

}
