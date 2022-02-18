package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    int satiety;

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Травоядные едят траву");
            //this.satiety = this.getSatiety()+ food.getEnergy();
            this.setSatiety(food.getEnergy());
        } else System.out.println("Травоядные не едят мясо");

    }

}