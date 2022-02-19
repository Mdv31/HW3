package model;

import animals.Duck;

import java.util.HashMap;


public class Aviary <Animal> {
    private Size size;

    public Aviary(Size size) {

    }
    HashMap<String ,Animal> namesAndAnimals = new HashMap<>();

    public void addAnimal(String name, Animal animal){
        namesAndAnimals.put(name, animal);
    }
    public void getAnimal (String name){
        namesAndAnimals.get(name);
    }
    public void removeAnimal (String name){
        namesAndAnimals.remove(name);
    }
}
