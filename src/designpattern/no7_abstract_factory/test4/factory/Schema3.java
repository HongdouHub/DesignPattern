package designpattern.no7_abstract_factory.test4.factory;

import designpattern.no7_abstract_factory.test4.cpu.IntelCPU;
import designpattern.no7_abstract_factory.test4.mainboard.GAMainBoard;
import designpattern.no7_abstract_factory.test4.memory.HyMemory;

public class Schema3 implements AbstractFactory {

    @Override
    public Object createProduct(int type) {
        Object result = null;

        if (type == 1) {
            result = new IntelCPU(1156);
        } else if (type == 2) {
            result = new GAMainBoard(1156);
        } else if (type == 3) {
            result = new HyMemory();
        }
        return result;
    }
}
