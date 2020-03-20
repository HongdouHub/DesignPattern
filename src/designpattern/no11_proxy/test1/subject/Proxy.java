package designpattern.no11_proxy.test1.subject;

public class Proxy implements Subject {

    /**
     * 持有被代理的具体的目标对象
     */
    private RealSubject realSubject = null;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
