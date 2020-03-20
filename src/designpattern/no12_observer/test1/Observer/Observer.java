package designpattern.no12_observer.test1.Observer;

import designpattern.no12_observer.test1.Subject.Subject;

/**
 * 观察者接口，定义一个更新的接口给目标发生改变时通知被通知的对象
 */
public interface Observer {

    /**
     * 更新的接口
     */
    void update(Subject subject);
}
