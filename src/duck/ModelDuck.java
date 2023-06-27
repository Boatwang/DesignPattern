package duck;

import behavior.FlyBehavior.FlyNoWay;
import behavior.FlyBehavior.FlyWithWings;
import behavior.quackBehavoir.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        init();
    }

    private void init(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model Duck!");
    }

    @Override
    public String toString() {
        return "ModelDuck{" +
                "flyBehavior=" + flyBehavior +
                ", quackBehavior=" + quackBehavior +
                '}';
    }
}
