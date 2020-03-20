package designpattern.no14_iterator.test6.iterator;

import java.util.Collection;

public interface AggregationIterator {

    boolean hasNext();

    boolean hasPrevious();

    Collection getPage(int pageNum, int pageShow);
}
