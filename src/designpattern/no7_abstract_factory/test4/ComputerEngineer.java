package designpattern.no7_abstract_factory.test4;

import designpattern.no7_abstract_factory.test4.cpu.CPUApi;
import designpattern.no7_abstract_factory.test4.factory.AbstractFactory;
import designpattern.no7_abstract_factory.test4.mainboard.MainBoardApi;
import designpattern.no7_abstract_factory.test4.memory.MemoryApi;

public class ComputerEngineer {

    private CPUApi cpu = null;

    private MainBoardApi mainBoard = null;

    private MemoryApi memory = null;

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
        memory = (MemoryApi) schema.createProduct(3);

        cpu.calculate();
        mainBoard.installCPU();
        if (memory != null) {
            memory.cacheData();
        }
    }

}
