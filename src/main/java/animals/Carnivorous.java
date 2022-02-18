package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    int satiety;
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Хищники едят мясо");
            this.satiety = this.getSatiety()+ food.getEnergy();
        } else System.out.println("Хищники не едят траву");

    }
}