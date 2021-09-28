package factory.simple;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 21:43
 * @Version 1.0
 * @Description：
 */
public class PizzaStore {
    public void orderPizza() {
        Pizza pizza = SimpleFactory.creatPizza();
        System.out.println(pizza.getDescription());
        pizza.prepare();
        pizza.cut();
        pizza.box();
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza();
    }
}
