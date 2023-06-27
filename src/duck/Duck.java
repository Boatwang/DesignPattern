package duck;

import behavior.FlyBehavior.FlyBehavior;
import behavior.quackBehavoir.QuackBehavior;

public abstract class Duck {

    /**
     * 飞行行为
     */
    FlyBehavior flyBehavior;

    /**
     * 叫行为
     */
    QuackBehavior quackBehavior;

    public Duck(){}

    /**
     * 展示
     */
    public abstract void display();

    /**
     * 飞行
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 叫
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swim(){
        System.out.println("All duck float,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "flyBehavior=" + flyBehavior +
                ", quackBehavior=" + quackBehavior +
                '}';
    }
}
