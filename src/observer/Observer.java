package observer;

/**
 * @Author SunChonggao
 * @Date 2021-09-08 11:29
 * @Version 1.0
 * @Description：
 */
public interface Observer {
    /**
     * Subject transfer state to observer using this method
     * @param state the state value of subject
     */
    void update(int state);
}
