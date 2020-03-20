package designpattern.no14_iterator.test6.iterator;

import designpattern.no14_iterator.test6.bean.PayModel;
import designpattern.no14_iterator.test6.manager.SalaryManager;

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
    public Collection getPage(int pageNum, int pageShow) {
        Collection<PayModel> col = new ArrayList<PayModel> ();
        int start = (pageNum - 1) * pageShow;
        int end = start + pageShow - 1;

        if (start < 0) {
            start = 0;
        }

        if (end > pms.length - 1) {
            end = pms.length - 1;
        }

        index = 0;

        while (hasNext() && index <= end) {
            if (index >= start) {
                col.add(pms[index]);
            }
            index++;
        }
        return col;
    }
}
