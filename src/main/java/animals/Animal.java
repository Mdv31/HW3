package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal {
    String name;

    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    public int setSatiety(int k) {
        return this.satiety += k;
    }

    public String getName() {
        return name;
    }


    public abstract void eat(Food food) throws WrongFoodException;
    public abstract Size getSize();


}
