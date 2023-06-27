package duck;

import behavior.FlyBehavior.FlyWithWings;
import behavior.quackBehavoir.Squeak;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I `m a real RedHeadDuck!");
    }
}
