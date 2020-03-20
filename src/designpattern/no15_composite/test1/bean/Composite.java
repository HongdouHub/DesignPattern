package designpattern.no15_composite.test1.bean;

import designpattern.no15_composite.test1.utils.Printable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 组合对象
 */
public class Composite implements Printable {

    /**
     * 用来记录包含的其他组合对象
     */
    private Collection<Composite> childComposite = new ArrayList<Composite>();

    /**
     * 用来记录包含的其他叶子对象
     */
    private Collection<Leaf> childLeaf = new ArrayList<Leaf>();

    /**
     * 当前对象的名称
     */
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addComposite(Composite composite) {
        childComposite.add(composite);
    }

    public void addLeaf(Leaf leaf) {
        childLeaf.add(leaf);
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + name);
        preStr+=" ";

        for (Leaf leaf : childLeaf) {
            leaf.printStruct(preStr);
        }

        for (Composite composite : childComposite) {
            composite.printStruct(preStr);
        }
    }
}
