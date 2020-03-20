package designpattern.no14_iterator.test5.manager;

import designpattern.no14_iterator.test5.bean.PayModel;
import designpattern.no14_iterator.test5.iterator.AggregationIterator;
import designpattern.no14_iterator.test5.iterator.ArrayIteratorImpl;

public class SalaryManager extends Aggregate {

    private PayModel[] pms = null;

    public PayModel[] getPays() {
        return pms;
    }

    public void calcSalary() {
        PayModel p1 = new PayModel("王五-100", 6000);
        PayModel p2 = new PayModel("赵六-100", 3600);
        PayModel p3 = new PayModel("王五-200", 6000);
        PayModel p4 = new PayModel("赵六-200", 3600);
        PayModel p5 = new PayModel("王五-300", 6000);
        PayModel p6 = new PayModel("赵六-300", 3600);

        pms = new PayModel[6];
        pms[0] = p1;
        pms[1] = p2;
        pms[2] = p3;
        pms[3] = p4;
        pms[4] = p5;
        pms[5] = p6;
    }


    @Override
    public AggregationIterator createIterator() {
        return new ArrayIteratorImpl(this);
    }
}
