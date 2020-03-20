package designpattern.no14_iterator.test5.iterator;

import designpattern.no14_iterator.test5.bean.PayModel;
import designpattern.no14_iterator.test5.manager.SalaryManager;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 用来实现访问数组的迭代接口
 */
public class ArrayIteratorImpl implements AggregationIterator {

    /**
     * 用数组管理
     */
    private PayModel[] pms = null;

    /**
     * 用来记录当前迭代到的位置索引
     * 0 表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = 0;

    public ArrayIteratorImpl(SalaryManager salaryManager) {
        this.pms = salaryManager.getPays();
    }

    @Override
    public boolean hasNext() {
        return pms != null && index <= pms.length - 1;
    }

    @Override
    public boolean hasPrevious() {
        return pms != null && index > 0;
    }

    @Override
    public Collection next(int num) {
        Collection<PayModel> col = new ArrayList<PayModel> ();
        int count = 0;
        while (hasNext() && count < num) {
            col.add(pms[index++]);
            count++;
        }
        return col;
    }

    @Override
    public Collection previous(int num) {
        Collection<PayModel> col = new ArrayList<PayModel> ();
        int count = 0;
        index = index - num;
        while (hasPrevious() && count < num) {
            col.add(pms[index++]);
            count++;
        }
        return col;
    }

}