package designpattern.no12_observer.test2;

import designpattern.no12_observer.test2.Observer.Reader;
import designpattern.no12_observer.test2.Subject.NewsPaper;

public class Client {

    public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();
        Reader reader1 = new Reader("张三");
        Reader reader2 = new Reader("李四");
        Reader reader3 = new Reader("王五");

        newsPaper.addObserver(reader1);
        newsPaper.addObserver(reader2);
        newsPaper.addObserver(reader3);

        newsPaper.setContent("第12章 观察者模式");
    }

}
