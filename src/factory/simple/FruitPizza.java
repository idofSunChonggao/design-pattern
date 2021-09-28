package factory.simple;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 21:47
 * @Version 1.0
 * @Description：
 */
public class FruitPizza extends Pizza{
    public FruitPizza() {
        description = "FruitPizza";
    }
    /**
     * 返回pizza具体类型的描述
     *
     * @return
     */
    @Override
    public String getDescription() {
        return description;
    }
}
