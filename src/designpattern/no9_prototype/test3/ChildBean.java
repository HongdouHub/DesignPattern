package designpattern.no9_prototype.test3;

public class ChildBean implements Cloneable {

    private String childTaskNo;

    public String getChildTaskNo() {
        return childTaskNo;
    }

    public void setChildTaskNo(String childTaskNo) {
        this.childTaskNo = childTaskNo;
    }

    @Override
    public String toString() {
        return "ChildBean{" +
                "childTaskNo='" + childTaskNo + '\'' +
                '}';
    }

    public ChildBean(String childTaskNo) {
        this.childTaskNo = childTaskNo;
    }

    @Override
    protected ChildBean clone() {
        ChildBean bean = new ChildBean(childTaskNo);
        try {
            bean = (ChildBean) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("ChildBean CloneNotSupportedException:" + e);
        }
        return bean;
    }
}
