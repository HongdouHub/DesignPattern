package designpattern.no18_state.test3.leave;

import designpattern.no18_state.test3.base.StateMachine;

/**
 * 处理审核结束的类
 */
public class AuditOverState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel model = (LeaveRequestModel) request.getBusinessVO();
        System.out.println(model.getUser() + ",你的请假申请已经审核结束，结果是：" + model.getResult());
    }
}
