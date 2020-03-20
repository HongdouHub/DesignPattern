package designpattern.no14_iterator.test2.iterator;

import designpattern.no14_iterator.test2.manager.SalaryManager;

/**
 * 用来实现访问数组的迭代接口
 */
public class ArrayIteratorImpl implements Iterator {

    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager salaryManager = null;

    /**
     * 用来记录当前迭代到的位置索引
     * -1 表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = -1;

    public ArrayIteratorImpl(SalaryManager salaryManager) {
        this.salaryManager = salaryManager;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < salaryManager.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        return index == salaryManager.size();
    }

    @Override
    public Object currentItem() {
        return salaryManager.get(index);
    }
}
