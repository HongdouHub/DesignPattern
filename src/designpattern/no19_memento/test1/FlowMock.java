package designpattern.no19_memento.test1;

/**
 * 模拟运行流程，指代某一具体流程
 */
public class FlowMock {

    private String flowName;    // 流程名称
    private int tempResult;     // 存储外部的状态数据
    private String tempState;   // 存储外部的状态数据

    public FlowMock(String flowName) {
        this.flowName = flowName;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public void runPhaseOne() {
        tempResult = 3;
        tempState = "runPhaseOne";
    }

    public void schema1() {
        System.out.println("schema1 - rawData: " + tempState + "," + tempResult);
        tempResult += 11;
        tempState += ",schema1";
        System.out.println("schema1 - parseData: " + tempState + "," + tempResult);
    }

    public void schema2() {
        System.out.println("schema2 - rawData: " + tempState + "," + tempResult);
        tempResult += 22;
        tempState += ",schema2";
        System.out.println("schema2 - parseData: " + tempState + "," + tempResult);
    }

    public FlowMockMemento createMemento() {
        return new FlowMockMementoImpl(tempResult, tempState);
    }

    public boolean setMemento(FlowMockMemento memento) {
        if (memento instanceof FlowMockMementoImpl) {
            FlowMockMementoImpl mementoImpl = (FlowMockMementoImpl) memento;
            this.tempResult = mementoImpl.getTempResult();
            this.tempState = mementoImpl.getTempState();
            return true;
        }
        return false;
    }

    /**
     * 真正的备忘录对象，实现备忘录窄接口
     * 实现成私有的内部类，不让外部访问
     */
    private static class FlowMockMementoImpl implements FlowMockMemento {
        private int tempResult;     // 存储外部的状态数据
        private String tempState;   // 存储外部的状态数据

        public FlowMockMementoImpl(int tempResult, String tempState) {
            this.tempState = tempState;
            this.tempResult = tempResult;
        }

        public String getTempState() {
            return tempState;
        }

        public void setTempState(String tempState) {
            this.tempState = tempState;
        }

        public int getTempResult() {
            return tempResult;
        }

        public void setTempResult(int tempResult) {
            this.tempResult = tempResult;
        }
    }
}
