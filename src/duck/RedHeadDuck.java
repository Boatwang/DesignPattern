package duck;

import behavior.FlyBehavior.FlyWithWings;
import behavior.quackBehavoir.Quack;
import behavior.quackBehavoir.Squeak;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        init();
    }

    private void init(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I `m a real RedHeadDuck!");
    }

    @Override
    public String toString() {
        return "RedHeadDuck{" +
                "flyBehavior=" + flyBehavior +
                ", quackBehavior=" + quackBehavior +
                '}';
    }
}
