package designpattern.no19_memento.test1;

import designpattern.no19_memento.constants.BusinessConstants;

public class Client {

    public static void main(String[] args) {
        FlowMock mock = new FlowMock("TestFlow");
        mock.runPhaseOne();
        FlowMockMemento memento = mock.createMemento();
        FlowMementoCareTaker.getInstance().addProtoType(BusinessConstants.PROTO_FLOW_MEMENOTO, memento);

        mock.schema1();

        FlowMockMemento protoType = FlowMementoCareTaker.getInstance().getProtoType(BusinessConstants.PROTO_FLOW_MEMENOTO);
        boolean isSuccess = mock.setMemento(protoType);
        if (isSuccess) {
            mock.schema2();
        }
    }
}
