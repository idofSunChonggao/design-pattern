package factory.simple;

/**
 * @Author SunChonggao
 * @Date 2021-09-15 21:33
 * @Version 1.0
 * @Description：
 */
public abstract class Pizza {
    protected String description;

    /**
     * 返回pizza具体类型的描述
     * @return
     */
    public abstract String getDescription();
    public void prepare() {
        System.out.println("prepare");
    }
    public void cut() {
        System.out.println("cut");
    }
    public void box() {
        System.out.println("box");
    }
}
