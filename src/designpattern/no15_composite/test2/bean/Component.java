package designpattern.no15_composite.test2.bean;

public abstract class Component {

    /**
     * 输出组件自身的名称
     */
    public abstract void printStruct(String preStr);

    public void addChild(Component component) {
        throw new UnsupportedOperationException("该对象暂不支持这个功能");
    }

    public void removeChild(Component component) {
        throw new UnsupportedOperationException("该对象暂不支持这个功能");
    }

    public Component getChildren(int index) {
        throw new UnsupportedOperationException("该对象暂不支持这个功能");
    }
}
