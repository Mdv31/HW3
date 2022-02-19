package animals;


import model.Size;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    private final String voice;


    public Duck(String name) {
        this.name = name;
        this.voice = "Krya - Krya!";
    }

    private String name;
    public String getName() {
        return this.name;
    }

    public Size getSize() {
        return Size.SMALL;
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
