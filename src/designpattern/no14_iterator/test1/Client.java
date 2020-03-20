package designpattern.no14_iterator.test1;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        List payList = payManager.getPayList();
        Iterator it = payList.iterator();
        System.out.println("集团工资列表：");
        while (it.hasNext()) {
            PayModel pm = (PayModel) it.next();
            System.out.println(pm);
        }

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        PayModel[] pays = salaryManager.getPays();
        System.out.println("新收购的公司的工资列表：");
        for (PayModel model : pays) {
            System.out.println(model);
        }
    }
}
