package model;

import animals.Animal;

import java.util.HashMap;


public class Aviary <T extends Animal> {
    private T animal;

    private Size size;
    public Aviary(Size size) {
        this.size=size;
    }
    public Size getSize() {
        return this.size;
    }

    private HashMap<String, T> aviaryMap = new HashMap<>();

    public void addAnimal(T animal) {
        if (this.size.equals(animal.getSize())) {
            aviaryMap.put(animal.getName(), animal);
        } else {
            throw new WrongSizeException("!!! Исклюяение, размер животного отличается от размера вольера."+this.size+"  "+animal.getSize());
        }
    }

    public animals.Animal getAnimal (String name){
        return aviaryMap.get(name);
    }

    public boolean removeAnimal (String name){
        if (aviaryMap.containsKey(name)){
        aviaryMap.remove(name);
        return true;}
        else { System.out.println("Животного нет в вальере.");
            return false;}
    }
}
