package designpattern.no19_memento.test1;

import java.util.HashMap;
import java.util.Map;

/**
 * 负责保存模拟运行流程的对象的备忘录
 */
public class FlowMementoCareTaker {

    /**
     * 记录被保存的备忘录对象
     */
    private Map<String, FlowMockMemento> map;

    private FlowMementoCareTaker() {
        map = new HashMap<String, FlowMockMemento>();
    }

    public static FlowMementoCareTaker getInstance() {
        return FlowMementoCareTakerHolder.instance;
    }

    public synchronized boolean addProtoType(String key, FlowMockMemento protoType) {
        map.put(key, protoType);
        return true;
    }

    public synchronized FlowMockMemento getProtoType(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    public synchronized FlowMockMemento removeProtoType(String key) {
        return map.remove(key);
    }

    private static class FlowMementoCareTakerHolder {
        private static final FlowMementoCareTaker instance = new FlowMementoCareTaker();
    }
}
