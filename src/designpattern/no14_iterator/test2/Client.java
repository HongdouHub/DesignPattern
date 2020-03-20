package designpattern.no14_iterator.test2;

import designpattern.no14_iterator.test2.iterator.Iterator;
import designpattern.no14_iterator.test2.manager.PayManager;
import designpattern.no14_iterator.test2.manager.SalaryManager;

public class Client {

    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资列表：");
        test(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购的公司的工资列表：");
        test(salaryManager.createIterator());
    }

    private static void test(Iterator it) {
        it.first();
        while (!it.isDone()) {
            Object object = it.currentItem();
            System.out.println(object);
            it.next();
        }

    }

}
