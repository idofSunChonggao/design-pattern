package decorator;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 16:38
 * @Version 1.0
 * @Description：调料类，装饰者，
 */
public class Milk extends Beverage {
    /**
     * 实例变量  保存被装饰者 即饮料
     */
    private  Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.description + " Milk";
    }
    /**
     * calculate the price of beverage
     *
     * @return
     */
    @Override
    public double cost() {
        // 加牛奶要多收一块五
        return beverage.cost() + 1.5;
    }
}
