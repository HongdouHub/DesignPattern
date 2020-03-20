package designpattern.no9_prototype.test3;

import java.util.ArrayList;
import java.util.List;

public class MainBean implements Cloneable {

    private String taskNo;

    private int count;

    private List<ChildBean> childBeanList;

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ChildBean> getChildBeanList() {
        return childBeanList;
    }

    public void setChildBeanList(List<ChildBean> childBeanList) {
        this.childBeanList = childBeanList;
    }

    @Override
    protected MainBean clone() {
        MainBean bean = new MainBean();
        try {
            bean = (MainBean) super.clone();
            List<ChildBean> clone = new ArrayList<>();
            if (childBeanList != null) {
                childBeanList.forEach(childBean -> {
                            clone.add(childBean.clone());
                        });
            }
            bean.setChildBeanList(clone);
        } catch (CloneNotSupportedException ex) {
            System.err.println("MainBean CloneNotSupportedException:" + ex);
        }
        return bean;
    }

    @Override
    public String toString() {
        return "MainBean{" +
                "taskNo='" + taskNo + '\'' +
                ", count=" + count +
                ", childBeanList=" + listToString() +
                '}';
    }

    public String listToString() {
        if (childBeanList == null) {
            return "";
        }
        StringBuilder buffer = new StringBuilder();
        for (ChildBean bean : childBeanList) {
            buffer.append(bean);
        }
        return buffer.toString();
    }
}
