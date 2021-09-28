package observer;

/**
 * @Author SunChonggao
 * @Date 2021-09-09 9:48
 * @Version 1.0
 * @Description：
 */
public class ConcreteObserverB implements Observer {
    private int state;
    private Subject subject;

    public ConcreteObserverB(Subject subject) {
        subject.registerObserver(this);
        this.subject = subject;
    }
    /**
     * Subject transfer state to observer using this method
     *
     * @param state the state value of subject
     */
    @Override
    public void update(int state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return ConcreteObserverB.class.getName() + ":" + state;
    }
}
