package designpattern.no14_iterator.test6.manager;

import designpattern.no14_iterator.test6.iterator.AggregationIterator;

public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代器对象接口
     *
     * @return
     */
    public abstract AggregationIterator createIterator();
}
