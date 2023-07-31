package model;

import lib.InputHelper;

public class Cats extends Cat{
    public Cats() {
    }

    public Cats(int id, String name, int age, boolean gender) {
        super(id, name, age, gender);
    }

    @Override
    public String makeCaterwaul() {
        return null;
    }
}
