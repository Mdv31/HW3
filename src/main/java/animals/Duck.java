package animals;


public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    private final String voice;


    public Duck() {
        this.voice = "Krya - Krya!";
    }


    @Override
    public String getVoice() {
        return this.voice;
    }

    @Override
    public String fly() {
        return "Я лечу!";
    }

    @Override
    public String run() {
        return "Я бегу!";
    }

    @Override
    public String swim() {
        return "Я плыву!";
    }

}
