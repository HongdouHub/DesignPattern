package designpattern.no14_iterator.test1;

class SalaryManager {

    /**
     * 用数组管理
     */
    private PayModel[] pms = null;

    /**
     * 获取工资列表
     *
     * @return
     */
    public PayModel[] getPays() {
        return pms;
    }

    /**
     * 计算工资
     */
    public void calcSalary() {
        PayModel p1 = new PayModel("王五", 6000);
        PayModel p2 = new PayModel("赵六", 3600);

        pms = new PayModel[2];
        pms[0] = p1;
        pms[1] = p2;
    }

}
