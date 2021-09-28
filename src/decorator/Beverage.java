package decorator;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 15:29
 * @Version 1.0
 * @Description：抽象基类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * calculate the price of beverage
     * @return
     */
    public abstract double cost();
}
