import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.WrongSizeException;

import static model.Size.LARGE;
import static model.Size.SMALL;

public class Zoo {


    public static void main(String[] args) {
        Duck Donald = new Duck("Donald");
        Tiger Murka = new Tiger("Murka");
        Grass Trawa = new Grass();
        Meat Kolbasa = new Meat();
        Worker Ivan = new Worker();

        Ivan.getVoice(Donald);
        Ivan.feed(Donald, Trawa);
        Ivan.feed(Donald, Kolbasa);
        Ivan.getVoice(Murka);
        Ivan.feed(Murka, Trawa);
        Ivan.feed(Murka, Kolbasa);

        System.out.println("\nЭнергия от травы : " + Trawa.getEnergy());
        System.out.println("\nЭнергия от мяса : " + Kolbasa.getEnergy());

        Swim[] Swim = createPond();


        System.out.println(Swim[0]);
        System.out.println(Swim[1]);

        // ДЗ3

        //carnivorousAviary для хищников;
        Aviary<Carnivorous> carnivorousAviary= new Aviary<>(LARGE);
        //herbivoreAviary для травоядных.
        Aviary<Herbivore> herbivoreAviary= new Aviary<>(SMALL);
        fillCarnivorousAviary();

        Tiger T1 = new Tiger("T1");
        try {
            carnivorousAviary.addAnimal ("T1", T1);
        } catch (WrongSizeException e) {
            e.printStackTrace();
        }

        //getCarnivorous("T1");
        carnivorousAviary.getAnimal("T1");


    }
    static void getCarnivorous(String name){
        //carnivorousAviary.getAnimal(name);
    }

    static void fillCarnivorousAviary(){
        Tiger T1 = new Tiger("T1");
        Tiger T2 = new Tiger("T2");
       // return carnivorousAviary.addAnimal ("T1", T1);

    }

    static Swim[] createPond() {
        Swim[] Swim;
        Swim = new Swim[2];
        Swim[0] = new Duck("Donald");
        Swim[1] = new Fish("Flipper");
        return Swim;
    }
}
