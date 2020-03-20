package designpattern.no14_iterator.test6;

import designpattern.no14_iterator.test6.iterator.AggregationIterator;
import designpattern.no14_iterator.test6.manager.SalaryManager;

import java.util.Collection;

public class Client {

    public static void main (String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();

        AggregationIterator iterator = salaryManager.createIterator();

        Collection col = iterator.getPage(1, 2);
        System.out.println("第一页数据：");
        print(col);

        Collection col2 = iterator.getPage(2, 2);
        System.out.println("第二页数据：");
        print(col2);

        Collection col3 = iterator.getPage(1, 2);
        System.out.println("再次获取第二页数据：");
        print(col3);

        Collection col4 = iterator.getPage(3, 2);
        System.out.println("第三页数据：");
        print(col2);

    }

    private static void print(Collection col) {
        for (Object object : col) {
            System.out.println(object);
        }
    }

}
