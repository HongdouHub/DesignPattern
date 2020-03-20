package designpattern.no12_observer.test1.Subject;

import designpattern.no12_observer.test1.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，作为被观察者
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除注册的观察者对象
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有的注册的观察者对象
     */
    protected void notifyAllObservers() {
        for (int i = observers.size() - 1; i >= 0; i--)
            observers.get(i).update(this);
    }
}
