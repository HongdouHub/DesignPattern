package designpattern.no18_state.test3.base;

public interface State {

    /**
     * 执行状态相应的功能
     */
    void doWork(StateMachine machine);
}
