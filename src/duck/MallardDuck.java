package duck;

import behavior.FlyBehavior.FlyWithWings;
import behavior.quackBehavoir.Quack;

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
