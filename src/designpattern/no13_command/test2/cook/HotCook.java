package designpattern.no13_command.test2.cook;

/**
 * 热菜厨师
 */
public class HotCook implements CookApi {

    @Override
    public void cook(String name) {
        System.out.println("热菜厨师正在做：" + name);
    }
}
