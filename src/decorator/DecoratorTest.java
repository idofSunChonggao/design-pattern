package decorator;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 16:47
 * @Version 1.0
 * @Description：
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Beverage houseBlendAndMilk =
                new Milk(
                        new HouseBlend()
                );
        System.out.println(houseBlendAndMilk.getDescription());
        System.out.println(houseBlendAndMilk.cost());

        Beverage houseBlendAndSoy =
                new Soy(
                        new HouseBlend()
                );
        System.out.println(houseBlendAndSoy.getDescription());
        System.out.println(houseBlendAndSoy.cost());
    }
}
