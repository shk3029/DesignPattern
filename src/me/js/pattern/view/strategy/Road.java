package me.js.pattern.view.strategy;

import me.js.pattern.domain.strategy.CoffeeMachine;
import me.js.pattern.domain.strategy.AmericanoStrategy;
import me.js.pattern.domain.strategy.CafeLatteStrategy;
import me.js.pattern.domain.strategy.CoffeeStrategy;
import me.js.pattern.domain.strategy.HotChocolateStrategy;

public class Road {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String americano = coffeeMachine.brew(americanoButton());
        System.out.println(americano);

        String cafelatte = coffeeMachine.brew(cafeLatteButton());
        System.out.println(cafelatte);

        String hotchocolate = coffeeMachine.brew(hotChocolateButton());
        System.out.println(hotchocolate);
    }

    public static CoffeeStrategy americanoButton() {
        return new AmericanoStrategy();
    }

    public static CoffeeStrategy cafeLatteButton() {
        return new CafeLatteStrategy();
    }

    public static CoffeeStrategy hotChocolateButton() {
        return new HotChocolateStrategy();
    }
}
