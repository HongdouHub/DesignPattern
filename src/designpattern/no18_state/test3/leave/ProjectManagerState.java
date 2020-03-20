package designpattern.no18_state.test3.leave;

import designpattern.no18_state.test3.base.StateMachine;
import designpattern.no18_state.test3.constants.BusinessConstants;

import java.util.Scanner;

/**
 * 项目经理的审核
 */
public class ProjectManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel model = (LeaveRequestModel) request.getBusinessVO();
        handleManagerResult(model);
        if (!BusinessConstants.REQUEST_TYPE_AGREE.equals(model.getResult())) {
            request.setState(new AuditOverState());
            request.doWork();
            return;
        }

        if (model.getLeaveDays() > BusinessConstants.LEAVE_DAYS) {
            request.setState(new DepManagerState());
        } else {
            request.setState(new AuditOverState());
        }
        request.doWork();
    }

    private void handleManagerResult(LeaveRequestModel model) {
        System.out.println("项目经理审核中，请稍等..");
        System.out.println(model.getUser() + "申请从" + model.getBeginDate() + "开始请假" + model.getLeaveDays() + "天\n");
        System.out.println("请项目经理审核（1为同意，2为不同意）:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int result = scanner.nextInt();
            model.setResult(result == 1 ? BusinessConstants.REQUEST_TYPE_AGREE :
                    BusinessConstants.REQUEST_TYPE_DISAGREE);
        }
    }
}
