package designpattern.no14_iterator.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户方已有的工资管理对象
 */
class PayManager {

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


}
