/**
 * @Author SunChonggao
 * @Date 2021-09-02 15:49
 * @Version 1.0
 * @Description：
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        var o1 = Singleton.getInstance();
        var o2 = Singleton.getInstance();
        System.out.println(o1 == o2);
    }
}
