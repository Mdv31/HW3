import animals.Animal;
import animals.Duck;
import animals.Fish;
import animals.Tiger;
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

        Animal[] Pond = createPond();
        System.out.println(Pond[0].swim());
        System.out.println(Pond[1].swim());

    }

    static Animal[] createPond() {
        Animal[] Pond;
        Pond = new Animal[2];
        Pond[0] = new Duck();
        Pond[1] = new Fish();
        return Pond;
    }
}
