package me.js.pattern.domain.strategy;

import me.js.pattern.domain.strategy.CoffeeStrategy;

public class CoffeeMachine {

    public String brew(CoffeeStrategy coffeeStrategy) {
        return coffeeStrategy.brew();
    }

}
