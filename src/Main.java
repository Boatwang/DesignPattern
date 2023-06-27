import behavior.FlyBehavior.FlyRocketPowered;
import duck.MallardDuck;
import duck.ModelDuck;

/**
 * 策略模式简单的例子
 * 将不变的部分和变化的部分区分
 * 1.不变的部分作为抽象父类
 * 2.变化的部分作为接口，聚合在抽象父类中
 *      将会变化的具体代码实现接口
 */
public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}