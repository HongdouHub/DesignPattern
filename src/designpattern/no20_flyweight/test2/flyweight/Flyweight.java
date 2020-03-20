package designpattern.no20_flyweight.test2.flyweight;

public interface Flyweight {

    /**
     * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
     *
     * @param securityEntity    安全实体
     * @param permit            权限
     * @return                  返回true表示匹配
     */
    boolean match(String securityEntity, String permit);

}
