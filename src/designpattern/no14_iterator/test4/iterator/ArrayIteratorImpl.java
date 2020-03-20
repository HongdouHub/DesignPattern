package designpattern.no14_iterator.test4.iterator;

import designpattern.no14_iterator.test4.bean.PayModel;
import designpattern.no14_iterator.test4.manager.SalaryManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 用来实现访问数组的迭代接口
 */
public class ArrayIteratorImpl implements Iterator {

    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager salaryManager = null;

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
        this.salaryManager = salaryManager;
    }

    public ArrayIteratorImpl(SalaryManager salaryManager, double maxPay) {
        Collection<PayModel> tempCol = new ArrayList<PayModel>();
        for (PayModel model : salaryManager.getPays()) {
            if (model.getPay() < maxPay) {
                tempCol.add(model);
            }
        }

        pms = new PayModel[tempCol.size()];
        for (int i = 0; i < tempCol.size(); i++) {
            pms[i] = ((ArrayList<PayModel>) tempCol).get(i);
        }
    }

    @Override
    public boolean hasNext() {
        if (salaryManager != null) {
            return index >= 0 && index < salaryManager.size();
        }

        if (pms != null) {
            return index >= 0 && index <= pms.length - 1;
        }

        return false;
    }

    @Override
    public Object next() {
        Object object = null;
        if (hasNext()) {

            if (salaryManager != null) {
                object = salaryManager.get(index);
            } else {
                object = pms[index];
            }
            index++;
        }

        ((PayModel) object).setPay(0.0);
        return object;
    }

    @Override
    public void remove() {
        // TODO: 2019/4/29 需要删除当前index游标下的Object
    }

}