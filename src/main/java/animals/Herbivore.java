package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {
    int satiety;

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("Травоядные едят траву");
            this.setSatiety(food.getEnergy());
        } else throw new WrongFoodException("Травоядные не едят мясо");
    }

}