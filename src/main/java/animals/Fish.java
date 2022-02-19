package animals;


import model.Size;

public class Fish extends Herbivore implements Swim {

    public Fish(String name) {
        this.name = name;
    }

    private String name;
    public String getName() {
        return this.name;
    }

    public Size getSize() {
        return Size.MEDIUM;
    }


    @Override
    public String swim() {
        return "Я плыву!";
    }

    public String getVoice() {
        return null;
    }

}
