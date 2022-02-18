package animals;

import food.Food;

public abstract class Animal {
    private int satiety = 10;

    public int getSatiety(int k) {
        return satiety+=k;
    }


    public abstract void eat(Food food);


}
