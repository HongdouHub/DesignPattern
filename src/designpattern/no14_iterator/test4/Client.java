package designpattern.no14_iterator.test4;

import designpattern.no14_iterator.test4.manager.PayManager;
import designpattern.no14_iterator.test4.manager.SalaryManager;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资列表：");
        test4(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购的公司的工资列表：");
        test4(salaryManager.createIterator(4000));
    }

    private static void test4(Iterator it) {
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }

}
