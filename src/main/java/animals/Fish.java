package animals;


import model.Size;

public class Fish extends Herbivore implements Swim {

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
