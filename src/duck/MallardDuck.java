package duck;

import behavior.FlyBehavior.impl.FlyWithWings;
import behavior.quackBehavoir.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I `m a real MallardDuck!");
    }
}
