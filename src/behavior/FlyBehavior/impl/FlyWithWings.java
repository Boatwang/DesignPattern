package behavior.FlyBehavior.impl;

import behavior.FlyBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I `m flying!");
    }
}
