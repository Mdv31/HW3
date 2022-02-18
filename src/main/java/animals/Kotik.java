package animals;

public class Kotik  extends Carnivorous implements Run, Swim, Voice {
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

    private static final int METHODS = 5;
    private static int count = 0;
    private int weight;
    private String name;
    private String voice;
    //private int satiety=(int) (Math.random() * 10) + 1;
    private int satiety;
    private String[] arrayLiveDay;


    public Kotik() {
        ++count;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        ++count;
        this.weight = weight;
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
    }

    public static int getCount() {
        return count;
    }


    boolean play() {
        if (getSatiety() > 0) {
            this.satiety--;
            System.out.println("Cat is play! ^_^");
            return true;
        } else return false;
    }

    boolean sleep() {
        if (this.satiety_test(this.satiety)) {
            System.out.println("Cat is sleep! ^_^");
            return true;
        } else return false;
    }

    boolean wash() {
        if (this.satiety_test(this.satiety)) {
            System.out.println("Cat is wash! ^_^");
            return true;
        } else return false;
    }

    boolean walk() {
        if (this.satiety_test(this.satiety)) {
            System.out.println("Cat is walk! ^_^");
            return true;
        } else return false;
    }

    boolean hunt() {
        if (this.satiety_test(this.satiety)) {
            System.out.println("Cat is hunt! ^_^");
            return true;
        } else return false;
    }

    boolean satiety_test(int satiety) {
        if (this.satiety > 0) {
            this.satiety--;
            return true;
        } else {
            System.out.println("Give me food, pls! ^_^");
            this.eat((int) (Math.random() * 5) + 1);
            return false;
        }
    }

    void eat(int satiety) {
        this.satiety += satiety;
    }

    void eat(int satiety, String food) {
        this.satiety += satiety;
    }

    void eat() {
        eat(5, "kolbasa");
    }

    public String[] liveAnotherDay() {
        String[] arrayLiveDay = new String[24];
        this.arrayLiveDay = arrayLiveDay;
        for (int hour = 0; hour <= 23; hour++) {
            int i = (int) (Math.random() * METHODS) + 1;
            switch (i) {
                case (1): {
                    if (this.play()) arrayLiveDay[hour] = hour + " - играл";
                    else arrayLiveDay[hour] = hour + " - ел";
                    break;
                }
                case (2): {
                    if (this.sleep()) arrayLiveDay[hour] = hour + " - спал";
                    else arrayLiveDay[hour] = hour + " - ел";
                    break;
                }
                case (3): {
                    if (this.wash()) arrayLiveDay[hour] = hour + " - умывался";
                    else arrayLiveDay[hour] = hour + " - ел";
                    break;
                }
                case (4): {
                    if (this.walk()) arrayLiveDay[hour] = hour + " - гулял";
                    else arrayLiveDay[hour] = hour + " - ел";
                    break;
                }
                case (5): {
                    if (this.hunt()) arrayLiveDay[hour] = hour + " - охотился";
                    else arrayLiveDay[hour] = hour + " - ел";
                    break;
                }
            }
        }
        return this.arrayLiveDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice1() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getArrayLiveDay(int hour) {
        return arrayLiveDay[hour];
    }

    /* public boolean getSatiety (int k) {
         if (k > 0) {
             return true;
         } else return false;
     }*/
    public int getSatiety() {
        return this.satiety;
    }
}

