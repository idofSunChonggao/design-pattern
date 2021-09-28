package observer;

/**
 * @Author SunChonggao
 * @Date 2021-09-09 9:31
 * @Version 1.0
 * @Description：
 */
public class ConcreteObserverA implements Observer{
    private Subject subject;
    private int state;
    public ConcreteObserverA(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
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
        return ConcreteObserverA.class.getName() + ":" + state;
    }
}
