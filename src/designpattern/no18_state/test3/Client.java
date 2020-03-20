package designpattern.no18_state.test3;

import designpattern.no18_state.test3.leave.LeaveRequestContext;
import designpattern.no18_state.test3.leave.LeaveRequestModel;
import designpattern.no18_state.test3.leave.ProjectManagerState;

public class Client {

    public static void main(String[] args) {
        LeaveRequestModel leaveRequestModel = new LeaveRequestModel();
        leaveRequestModel.setUser("名字");
        leaveRequestModel.setBeginDate("2019-06-05");
        leaveRequestModel.setLeaveDays(1);

        LeaveRequestContext context = new LeaveRequestContext();
        context.setBusinessVO(leaveRequestModel);
        context.setState(new ProjectManagerState());

        context.doWork();
    }

}
