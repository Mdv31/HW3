package animals;

import food.Food;

public abstract class Animal {
    private final int satiety = 10;

    public int getSatiety() {
        return satiety;
    }

    public abstract void eat(Food food);


    public abstract String getVoice();

    public String swim() {
        return null;
    }

}
