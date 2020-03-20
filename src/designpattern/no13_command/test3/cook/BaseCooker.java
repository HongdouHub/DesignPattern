package designpattern.no13_command.test3.cook;

/**
 * 厨师的接口
 */
public class BaseCooker {

    private static final String START_COOK_MSG = "厨师：%s正在为%d号桌做：%s";
    private static final String FINISH_COOK_MSG = "厨师：%s为%d号桌做好了：%s，共计耗时=%d毫秒";

    protected String name;

    public void cook(int tableNum, String disName) {
        int cookTime = (int) (20 * Math.random());
        System.out.println(String.format(START_COOK_MSG, name, tableNum, disName));

        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format(FINISH_COOK_MSG, name, tableNum, disName, cookTime));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseCooker)) {
            return false;
        }
        BaseCooker cooker = (BaseCooker) obj;
        return cooker.getName().equals(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
