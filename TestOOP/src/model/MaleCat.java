package model;

public class MaleCat extends Cats{
    public MaleCat() {
        super();
        setSound("Éc éc");
    }

    @Override
    public String makeCaterwaul() {
        return getSound();
        //"Mèo đực " + getName() + " kêu: " +
    }

    public MaleCat(int id, String name, int age) {
        super(id, name, age, true);
        setSound("Éc éc");
    }

}
