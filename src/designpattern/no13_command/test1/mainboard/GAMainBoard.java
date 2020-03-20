package designpattern.no13_command.test1.mainboard;

public class GAMainBoard implements MainBoardApi {

    @Override
    public void open() {
        System.out.println("正在开机，请稍等...");
        System.out.println("接通电源...");
        System.out.println("装载系统...");
        System.out.println("机器正常运转起来...");
        System.out.println("机器已经正常打开");
    }

    @Override
    public void reset() {
        System.out.println("正在重新启动机器，请稍等...");
        System.out.println("已经正常打开");
    }
}
