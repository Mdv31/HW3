package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Травоядные едят траву");
        } else System.out.println("Травоядные не едят мясо");

    }

}