package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Хищники едят мясо");
        } else System.out.println("Хищники не едят траву");

    }
}