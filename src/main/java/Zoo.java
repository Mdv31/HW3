import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.WrongSizeException;

import static model.Size.LARGE;
import static model.Size.SMALL;

public class Zoo {


    // ДЗ3
    private static Aviary<Carnivorous> carnivorousAviary= new Aviary<>(LARGE);
    private static Aviary<Herbivore> herbivoreAviary= new Aviary<>(SMALL);


    public static void main(String[] args) {
        Duck Donald = new Duck("Donald");
        Tiger Murka = new Tiger("Murka");
        Grass Trawa = new Grass();
        Meat Kolbasa = new Meat();
        Worker Ivan = new Worker();

        Ivan.getVoice(Donald);
        Ivan.feed(Donald, Trawa);
        //Ivan.feed(Donald, Kolbasa);
        Ivan.getVoice(Murka);
        //Ivan.feed(Murka, Trawa);
        Ivan.feed(Murka, Kolbasa);

        Swim[] Swim = createPond();
        System.out.println(Swim[0]);
        System.out.println(Swim[1]);


        fillCarnivorousAviary();
        getCarnivorous("T1");
        fillHerbivoreAviary();
        getHerbivore("D1");


    }
    //Carnivorous
    static Animal getCarnivorous(String name){
        return carnivorousAviary.getAnimal(name);
    }
    //Herbivore
    static Animal getHerbivore(String name){
        return herbivoreAviary.getAnimal(name);
    }

    static void fillCarnivorousAviary(){
        Tiger T1 = new Tiger("T1");
        Tiger T2 = new Tiger("T2");
        //Duck D1 = new Duck("D1");
        try {
            carnivorousAviary.addAnimal (T1);
            carnivorousAviary.addAnimal (T2);
            //carnivorousAviary.addAnimal ("D1", D1);
        } catch (WrongSizeException e) {
            e.printStackTrace();
        }
    }
    static void fillHerbivoreAviary(){
        Duck D1 = new Duck("D1");
        Duck D2 = new Duck("D2");
        //Tiger T1 = new Tiger("T1");
        try {
            Zoo.herbivoreAviary.addAnimal (D1);
            Zoo.herbivoreAviary.addAnimal (D2);
            //herbivoreAviary.addAnimal ("T1", T1);
        } catch (WrongSizeException e) {
            e.printStackTrace();
        }
    }

    static Swim[] createPond() {
        Swim[] Swim;
        Swim = new Swim[2];
        Swim[0] = new Duck("Donald");
        Swim[1] = new Fish("Flipper");
        return Swim;
    }
}
