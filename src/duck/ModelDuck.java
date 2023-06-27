package duck;

import behavior.FlyBehavior.FlyNoWay;
import behavior.quackBehavoir.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model Duck!");
    }
}
