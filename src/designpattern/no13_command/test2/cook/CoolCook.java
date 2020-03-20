package designpattern.no13_command.test2.cook;

/**
 * 凉菜厨师
 */
public class CoolCook implements CookApi {

    @Override
    public void cook(String name) {
        System.out.println("凉菜厨师正在做：" + name);
    }
}
