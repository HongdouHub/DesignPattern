package designpattern.no14_iterator.test5.iterator;

import java.util.Collection;

/**
 * 定义翻页访问聚合元素的迭代接口
 */
public interface AggregationIterator {

    boolean hasNext();

    Collection next(int num);

    boolean hasPrevious();

    Collection previous(int num);

}
