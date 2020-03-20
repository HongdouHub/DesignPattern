package designpattern.no13_command.test3.cook;

import designpattern.no13_command.test3.command.Command;
import designpattern.no13_command.test3.command.CommandQueue;

/**
 * 凉菜厨师
 */
public class CoolCooker extends BaseCooker implements Runnable {

    private transient boolean runnable = true;
    private transient long sleepTime = 1000L;
    private transient long wholeTime = -sleepTime;

    public CoolCooker(String name) {
        this.name = name;
    }

    public CoolCooker() {
        this.name = "凉菜";
    }

    @Override
    public void run() {
        while (runnable) {
            Command command = CommandQueue.getCoolCookerCommand();
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
