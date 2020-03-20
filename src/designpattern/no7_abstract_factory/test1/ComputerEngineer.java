package designpattern.no7_abstract_factory.test1;

import designpattern.no7_abstract_factory.test1.cpu.CPUApi;
import designpattern.no7_abstract_factory.test1.cpu.CPUFactory;
import designpattern.no7_abstract_factory.test1.mainboard.MainBoardApi;
import designpattern.no7_abstract_factory.test1.mainboard.MainBoardFactory;

public class ComputerEngineer {
    private CPUApi cpu = null;

    private MainBoardApi mainBoard = null;

    public void makeComputer(int cpuType, int mainBoardType) {
        // 1.准备装机配件
        prepareHardWares(cpuType, mainBoardType);
        // 2.组装机器
        // 3.测试机器
        // 4.交付客户
    }

    private void prepareHardWares(int cpuType, int mainBoardType) {
        cpu = CPUFactory.createCpuApi(cpuType);
        mainBoard = MainBoardFactory.createMainBoardApi(mainBoardType);

        cpu.calculate();
        mainBoard.installCPU();
    }
}
