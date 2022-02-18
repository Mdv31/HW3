package animals;

public class Rabbit extends Herbivore implements Run, Voice {
    private final String voice;
    private int satiety;


    public Rabbit() {
        this.voice = "Piii - Piii!";
    }


    @Override
    public String getVoice() {
        return this.voice;
    }

    @Override
    public String run() {
        return "Я бегу!";
    }
}
