package designpattern.no7_abstract_factory.test2.factory;

import designpattern.no7_abstract_factory.test2.cpu.AMDCPU;
import designpattern.no7_abstract_factory.test2.cpu.CPUApi;
import designpattern.no7_abstract_factory.test2.mainboard.MSIMainBoard;
import designpattern.no7_abstract_factory.test2.mainboard.MainBoardApi;

public class Schema2 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new MSIMainBoard(939);
    }
}
