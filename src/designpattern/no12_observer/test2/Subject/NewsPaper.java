package designpattern.no12_observer.test2.Subject;

public class NewsPaper extends java.util.Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        startNotifyByPush();
        startNotifyByPull();
    }

    // 用 推 的方式
    private void startNotifyByPush() {
        // 用java中的Observer模式的时候，以下不可少
        this.setChanged();

        String temp = this.content;
        if (content != null && content.contains(" ")) {
            String[] splits = content.split(" ");
            temp = splits[0];
        }
        this.notifyObservers(temp);
    }

    // 用 拉 的方式
    private void startNotifyByPull() {
        // 用java中的Observer模式的时候，以下不可少
        this.setChanged();

        this.notifyObservers();
    }
}
