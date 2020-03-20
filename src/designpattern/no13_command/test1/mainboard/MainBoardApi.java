package designpattern.no13_command.test1.mainboard;

/**
 * 主板接口
 */
public interface MainBoardApi {
    /**
     * 开机功能
     */
    void open();

    /**
     * 重启功能
     */
    void reset();
}
