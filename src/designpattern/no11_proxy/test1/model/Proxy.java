package designpattern.no11_proxy.test1.model;

public class Proxy implements UserModelApi {

    /**
     * 持有被代理的具体的目标对象
     */
    private UserModel realSubject = null;

    /**
     * 标示是否已经重新装载过数据
     */
    private boolean loaded = false;

    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String getUserId() {
        if (realSubject == null) {
            return null;
        }
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        if (realSubject == null) {
            return;
        }
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        if (realSubject == null) {
            return null;
        }
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        if (realSubject == null) {
            return;
        }
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }

        if (realSubject == null) {
            return null;
        }
        return realSubject.getDepId();
    }

    @Override
    public void setDepId(String depId) {
        if (realSubject == null) {
            return;
        }
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        if (realSubject == null) {
            return null;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        if (realSubject == null) {
            return;
        }
        realSubject.setSex(sex);
    }

    private void reload() {

    }

    @Override
    public String toString() {
        return "Proxy{" +
                "userId=" + getUserId() +
                ", name=" + getName() +
                ", depId=" + getDepId() +
                ", sex=" + getSex() +
                "}\n";
    }
}
