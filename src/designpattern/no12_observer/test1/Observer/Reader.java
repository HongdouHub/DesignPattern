package designpattern.no12_observer.test1.Observer;

import designpattern.no12_observer.test1.Subject.NewsPaper;
import designpattern.no12_observer.test1.Subject.Subject;

public class Reader implements Observer {

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
    public void update(Subject subject) {
        System.out.println(name + ":\n\t收到了NewsPaper，内容为：" +
                ((NewsPaper) subject).getContent());
    }
}
