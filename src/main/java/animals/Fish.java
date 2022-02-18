package animals;


public class Fish extends Herbivore implements Swim {

    @Override
    public String swim() {
        return "Я плыву!";
    }

    public String getVoice() {
        return null;
    }

}
