package model;

import java.util.HashMap;


public class Aviary <Animal> {
    private Size size;

    public Aviary(Size size) {
        this.size=size;
    }
    public Size getSize() {
        return this.size;
    }

    HashMap<String, animals.Animal> namesAndAnimals = new HashMap<>();

    public void addAnimal(String name, animals.Animal animal) throws WrongSizeException{
        if (this.size.equals(animal.getSize())) {
            namesAndAnimals.put(name, animal);
        } else {
            throw new WrongSizeException("!!! Исклюяение, размер животного отличается от размера вольера."+this.size+"  "+animal.getSize());
        }


    }
    public animals.Animal getAnimal (String name){
        return namesAndAnimals.get(name);
    }
    public boolean removeAnimal (String name){
        if (namesAndAnimals.containsKey(name)){
        namesAndAnimals.remove(name);
        return true;}
        else { System.out.println("Животного нет в вальере.");
            return false;}
    }
}
