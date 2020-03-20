package designpattern.no10_mediator.mediator;

import designpattern.no10_mediator.colleague.Colleague;

/**
 * 中介者对象的接口
 */
public interface Mediator {

    /**
     * 同事对象在自身改变的时候通知中介者的方法
     * 让中介者去负责相应的操作与其他同事对象交互
     *
     * @param colleague
     */
    void changed(Colleague colleague);

}
