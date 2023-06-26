package behavior.quackBehavoir.impl;

import behavior.quackBehavoir.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
