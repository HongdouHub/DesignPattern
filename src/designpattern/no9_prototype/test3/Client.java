package designpattern.no9_prototype.test3;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        MainBean mainBean = generateMainBean();
        System.out.println(mainBean);

        MainBean clone = mainBean.clone();
        List<ChildBean> childBeanList = clone.getChildBeanList();
        childBeanList.get(0).setChildTaskNo("abc");
        clone.setCount(100);
        System.out.println(clone);

        System.out.println("--------------");
        System.out.println(mainBean);
    }

    private static MainBean generateMainBean() {
        MainBean mainBean = new MainBean();
        mainBean.setTaskNo("mainBeanTaskNo");
        mainBean.setCount(200);

        ArrayList<ChildBean> list = new ArrayList<>();

        for (int i=0; i<3; i++) {
            list.add(new ChildBean("childTaskNo:" + i));
        }
        mainBean.setChildBeanList(list);
        return mainBean;
    }
}
