package designpattern.no14_iterator.test4.manager;

import designpattern.no14_iterator.test4.bean.PayModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 客户方已有的工资管理对象
 */
public class PayManager extends Aggregate {

    /**
     * 聚合对象
     */
    private List<PayModel> list = new ArrayList<PayModel> ();

    /**
     * 获取工资列表
     *
     * @return
     */
    public List<PayModel> getPayList() {
        return list;
    }

    /**
     * 计算工资
     */
    public void calcPay() {
        PayModel p1 = new PayModel("张三", 3800);
        PayModel p2 = new PayModel("李四", 5800);

        list.add(p1);
        list.add(p2);
    }


    @Override
    public Iterator createIterator() {
        return list.iterator();
    }

//    @Override
//    public Object get(int index) {
//        Object object = null;
//        if (index < list.size()) {
//            object = list.get(index);
//        }
//        return object;
//    }
//
//    @Override
//    public int size() {
//        return list.size();
//    }
}
