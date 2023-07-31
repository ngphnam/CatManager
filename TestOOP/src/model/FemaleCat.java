package model;

public class FemaleCat extends Cats{
    public FemaleCat() {
        super();
        setSound("Gâu gâu");
    }

    @Override
    public String makeCaterwaul() {
        return getSound();
        //"Mèo cái " + getName() + " kêu: " +
    }

    public FemaleCat(int id, String name, int age) {
        super(id, name, age, false);
        setSound("Gâu gâu");
    }
}
