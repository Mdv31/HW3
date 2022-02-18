import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {


    public static void main(String[] args) {
        Duck Donald = new Duck();
        Tiger Murka = new Tiger();
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



        //System.out.println(Swim(Pond[0]));
        System.out.println(Swim[0]);
        System.out.println(Swim[1]);


    }

    static Swim[] createPond() {
        Swim[] Swim;
        Swim = new Swim[2];
        Swim[0] = new Duck();
        Swim[1] = new Fish();
        return Swim;
    }
}
