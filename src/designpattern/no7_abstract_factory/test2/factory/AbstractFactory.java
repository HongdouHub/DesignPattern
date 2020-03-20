package designpattern.no7_abstract_factory.test2.factory;

import designpattern.no7_abstract_factory.test2.cpu.CPUApi;
import designpattern.no7_abstract_factory.test2.mainboard.MainBoardApi;

public interface AbstractFactory {

    /**
     * 创建CPU对象
     * @return
     */
    CPUApi createCPUApi();

    /**
     * 创建MainBoard对象
     * @return
     */
    MainBoardApi createMainBoardApi();

}
