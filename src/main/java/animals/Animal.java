package animals;

import food.Food;

public abstract class Animal {
    private int satiety = 10;

    public int getSatiety() {
        return satiety+=10;
    }


    public abstract void eat(Food food);


}
