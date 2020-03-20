package designpattern.no7_abstract_factory.test3.factory;

import designpattern.no7_abstract_factory.test3.cpu.AMDCPU;
import designpattern.no7_abstract_factory.test3.mainboard.MSIMainBoard;

public class Schema2 implements AbstractFactory {

    @Override
    public Object createProduct(int type) {
        Object result = null;

        if (type == 1) {
            result = new AMDCPU(939);
        } else if (type == 2) {
            result = new MSIMainBoard(939);
        }
        return result;
    }
}
