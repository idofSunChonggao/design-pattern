package factory.simple;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 22:23
 * @Version 1.0
 * @Description：
 */
public class SimpleFactory {
    public static Pizza creatPizza() {
        Pizza pizza = new FruitPizza();
        return pizza;
    }
}
