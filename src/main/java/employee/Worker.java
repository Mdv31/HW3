package employee;

import animals.Animal;
import food.Food;
import food.WrongFoodException;


public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println("\nРабочий дал корм");
        try {
            animal.eat(food);
        }catch (WrongFoodException e){
        e.printStackTrace();
        }
    }

    public void getVoice(animals.Voice animal) {
        System.out.println("\nРабочий запросил голос");
        System.out.println(animal.getVoice());

    }
}
