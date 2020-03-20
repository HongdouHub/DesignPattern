package designpattern.no14_iterator.test2.manager;

import designpattern.no14_iterator.test2.bean.PayModel;
import designpattern.no14_iterator.test2.iterator.ArrayIteratorImpl;
import designpattern.no14_iterator.test2.iterator.Iterator;

public class SalaryManager extends Aggregate {

    /**
     * 用数组管理
     */
    private PayModel[] pms = new PayModel[0];

    /**
     * 获取工资列表
     *
     * @return
     */
    public PayModel[] getPays() {
        return pms;
    }

    /**
     * 计算工资
     */
    public void calcSalary() {
        PayModel p1 = new PayModel("王五", 6000);
        PayModel p2 = new PayModel("赵六", 3600);

        pms = new PayModel[2];
        pms[0] = p1;
        pms[1] = p2;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIteratorImpl(this);
    }

    @Override
    public Object get(int index) {
        Object object = null;
        if (index < pms.length) {
            object = pms[index];
        }
        return object;
    }

    @Override
    public int size() {
        return pms.length;
    }
}
