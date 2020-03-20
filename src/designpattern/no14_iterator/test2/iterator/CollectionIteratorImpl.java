package designpattern.no14_iterator.test2.iterator;

import designpattern.no14_iterator.test2.manager.PayManager;

/**
 * 用来实现访问Collection集合的迭代接口，为了外部统一访问方式
 */
public class CollectionIteratorImpl implements Iterator {

    /**
     * 用来存放被迭代的聚合对象
     */
    private PayManager payManager = null;

    /**
     * 用来记录当前迭代到的位置索引
     * -1 表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = -1;

    public CollectionIteratorImpl(PayManager payManager) {
        this.payManager = payManager;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < payManager.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        return index == payManager.size();
    }

    @Override
    public Object currentItem() {
        return payManager.get(index);
    }
}
