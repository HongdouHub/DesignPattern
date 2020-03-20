package designpattern.no13_command.test3.cook;

import designpattern.no13_command.test3.command.Command;
import designpattern.no13_command.test3.command.CommandQueue;

/**
 * 热菜厨师
 */
public class HotCooker extends BaseCooker implements Runnable {

    private transient boolean runnable = true;
    private transient long sleepTime = 1000L;
    private transient long wholeTime = -sleepTime;

    public HotCooker(String name) {
        this.name = name;
    }

    public HotCooker() {
        this.name = "热菜";
    }

    @Override
    public void run() {
        while (runnable) {
            Command command = CommandQueue.getHotCookerCommand();
            if (command != null) {
                command.execute();
            } else {
                wholeTime += sleepTime;
            }

            if (wholeTime / sleepTime > 3) {
                runnable = false;
                System.out.println("厨师：" + name + " 休息了");
            }

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
