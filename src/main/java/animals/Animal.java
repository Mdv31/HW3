package animals;

import food.Food;

public abstract class Animal {
    public int satiety = 10;

    public int getSatiety() {
        //return satiety+=10;
        return satiety;
    }


    public abstract void eat(Food food);


}
