package designpattern.no7_abstract_factory.test2.factory;

import designpattern.no7_abstract_factory.test2.cpu.CPUApi;
import designpattern.no7_abstract_factory.test2.cpu.IntelCPU;
import designpattern.no7_abstract_factory.test2.mainboard.GAMainBoard;
import designpattern.no7_abstract_factory.test2.mainboard.MainBoardApi;

public class Schema1 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new GAMainBoard(1156);
    }
}
