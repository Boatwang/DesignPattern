package duck;

import behavior.FlyBehavior.impl.FlyWithWings;
import behavior.quackBehavoir.impl.Squeak;
import duck.Duck;

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
