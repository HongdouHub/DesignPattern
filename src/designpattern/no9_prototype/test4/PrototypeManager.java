package designpattern.no9_prototype.test4;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private Map<String, Prototype> map;

    private PrototypeManager() {
        map = new HashMap<String, Prototype>();
    }

    public static PrototypeManager getInstance() {
        return PrototypeManagerHolder.instance;
    }

    public synchronized boolean addPrototype(String key, Prototype prototype) {
        map.put(key, prototype);
        return true;
    }

    public synchronized Prototype removePrototype(String key) {
        return map.remove(key);
    }

    public synchronized Prototype getPrototype(String key) {
        Prototype object = null;

        if (map.containsKey(key)) {
            object = map.get(key).clone();
        }
        return object;
    }

    private static class PrototypeManagerHolder {
        private static final PrototypeManager instance = new PrototypeManager();
    }
}
