package animals;

import model.Size;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    private final String voice;


    public Tiger() {
        this.voice = "Mrrrr - Mrrrr!";
    }

    public Size getSize() {
        return Size.LARGE;
    }


    @Override
    public String getVoice() {
        return this.voice;
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
