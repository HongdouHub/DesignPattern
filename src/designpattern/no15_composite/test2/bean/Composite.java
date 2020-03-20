package designpattern.no15_composite.test2.bean;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> childComponents = null;

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component component) {
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(component);
    }

    @Override
    public void removeChild(Component component) {
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
            return;
        }
        childComponents.remove(component);
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + name);

        if (childComponents != null) {
            preStr += " ";
            for (Component c : childComponents) {
                c.printStruct(preStr);
            }
        }
    }
}
