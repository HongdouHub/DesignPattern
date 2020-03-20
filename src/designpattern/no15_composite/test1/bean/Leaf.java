package designpattern.no15_composite.test1.bean;

import designpattern.no15_composite.test1.utils.Printable;

/**
 * 叶子对象
 */
public class Leaf implements Printable {
    /**
     * 当前对象的名称
     */
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
