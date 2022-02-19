import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

import static model.Size.LARGE;
import static model.Size.SMALL;

public class Zoo {


    public static void main(String[] args) {
        Duck Donald = new Duck("Donald");
        Tiger Murka = new Tiger("Murka");
        Grass Trawa = new Grass();
        Meat Kolbasa = new Meat();
        Worker Ivan = new Worker();

        // При выхове метода гетвойс воркером у воркера - ошибка :
        // java: incompatible types: main.java.employee.Worker cannot be converted to main.java.animals.Animal
        // Для проверки снять комментарий
        //Ivan.getVoice(Ivan);

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

        //carnivorousAviary для хищников;
        Aviary<Carnivorous> carnivorousAviary= new Aviary<>(LARGE);
        //herbivoreAviary для травоядных.
        Aviary<Herbivore> herbivoreAviary= new Aviary<>(SMALL);


    }

    static Swim[] createPond() {
        Swim[] Swim;
        Swim = new Swim[2];
        Swim[0] = new Duck("Donald");
        Swim[1] = new Fish("Flipper");
        return Swim;
    }
}
