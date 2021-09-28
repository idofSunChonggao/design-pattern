package decorator;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 16:33
 * @Version 1.0
 * @Description：组件类，被装饰者，饮料类
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend";
    }
    /**
     * calculate the price of beverage
     *
     * @return
     */
    @Override
    public double cost() {
        return 20;
    }
}
