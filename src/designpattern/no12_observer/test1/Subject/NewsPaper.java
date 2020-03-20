package designpattern.no12_observer.test1.Subject;

/**
 * 报纸对象，具体的目标实现
 */
public class NewsPaper extends Subject {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyAllObservers();
    }
}
