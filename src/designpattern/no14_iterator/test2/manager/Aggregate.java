package designpattern.no14_iterator.test2.manager;

import designpattern.no14_iterator.test2.iterator.Iterator;

public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代器对象接口
     *
     * @return
     */
    public abstract Iterator createIterator();

    /**
     * 获取index游标下的Item
     *
     * @param index
     * @return
     */
    public abstract Object get(int index);

    /**
     * 获取结合的大小
     *
     * @return
     */
    public abstract int size();
}
