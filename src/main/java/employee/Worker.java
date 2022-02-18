package employee;

import animals.Animal;
import food.Food;


public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println("\nРабочий дал корм");
        animal.setSatiety(food.getEnergy());
        //animal.satiety = animal.getSatiety()+ food.getEnergy();
        //animal.eat(food);

    }

    public void getVoice(animals.Voice animal) {
        System.out.println("\nРабочий запросил голос");
        System.out.println(animal.getVoice());

    }
}
