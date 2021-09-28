package decorator;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 16:45
 * @Version 1.0
 * @Description：
 */
public class Soy extends Beverage {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + " Soy";
    }

    /**
     * calculate the price of beverage
     *
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + 3.0;
    }
}
