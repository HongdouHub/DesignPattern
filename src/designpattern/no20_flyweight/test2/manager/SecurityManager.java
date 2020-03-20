package designpattern.no20_flyweight.test2.manager;

import designpattern.no20_flyweight.test2.dao.TestDB;
import designpattern.no20_flyweight.test2.flyweight.Flyweight;
import designpattern.no20_flyweight.test2.flyweight.FlyweightFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityManager {

    private Map<String, Collection<Flyweight>> map;

    private SecurityManager() {
        map = new HashMap<String, Collection<Flyweight>>();
    }

    public static SecurityManager getInstance() {
        return SecurityManagerHolder.instance;
    }

    public void login(String user) {
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }

    /**
     * 从数据库中获取某人所拥有的权限
     */
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<Flyweight>();
        for (String s : TestDB.colDB) {
            String ss[] = s.split(",");
            if (ss[0].equals(user)) {
                Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
                col.add(flyweight);
            }
        }
        return col;
    }

    /**
     * 判断某用户对某个安全实体是否拥有某种权限
     */
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = map.get(user);
        if (col == null || col.isEmpty()) {
            System.err.println("没有登陆或者没有被分配任何权限");
            return false;
        }

        for (Flyweight flyweight : col) {
            if (flyweight.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }


    private static class SecurityManagerHolder {
        private static SecurityManager instance = new SecurityManager();
    }
}
