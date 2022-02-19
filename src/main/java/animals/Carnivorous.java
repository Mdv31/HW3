package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {
    int satiety;

    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Хищники едят мясо");
            this.setSatiety(food.getEnergy());
        } else throw new WrongFoodException("Хищники не едят траву");


    }
}