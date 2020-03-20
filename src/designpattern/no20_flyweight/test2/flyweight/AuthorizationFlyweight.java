package designpattern.no20_flyweight.test2.flyweight;

/**
 * 封装授权数据中重复出现部分的享元对象
 */
public class AuthorizationFlyweight implements Flyweight {

    private String securityEntity;  // 内部状态，安全实体
    private String permit;          // 内部状态，权限

    public AuthorizationFlyweight(String state) {
        try {
            String[] ss = state.split(",");
            securityEntity = ss[0];
            permit = ss[1];
        } catch (Exception e) {
            System.err.println("AuthorizationFlyweight split - " + e + ", state = " + state);
            securityEntity = "";
            permit = "";
        }
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        return this.securityEntity.equals(securityEntity) &&
            this.permit.equals(permit);
    }
}
