package designpattern.no12_observer.test2.Observer;

import designpattern.no12_observer.test2.Subject.NewsPaper;

import java.util.Observable;

public class Reader implements java.util.Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reader() {
        //
    }

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg != null) {
            // 采用推的方式
            System.out.println(name + ":\n\t收到了NewsPaper，通过 推 的方式获取的内容为：" + arg);
        } else {
            // 采用拉的方式
            System.out.println(name + ":\n\t收到了NewsPaper，通过 拉 的方式获取的内容为：" +
                    ((NewsPaper) o).getContent());
        }
        System.out.println();
    }
}
