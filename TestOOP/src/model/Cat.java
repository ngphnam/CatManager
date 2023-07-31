package model;

import lib.InputHelper;

public abstract class Cat {
    private int id;
    private String name;
    private int age;
    private boolean gender;
    private String sound;

    public Cat() {
        id = InputHelper.intHelper("Mời nhập id cho mèo: ", "Sai kiểu dữ liệu");
        name = InputHelper.stringHelper("Mời nhập vào tên mèo", "Lỗi độ dài", 0, 20);
        age = InputHelper.intHelper("Mời nhập tuổi cho mèo: ", "Sai kiểu dữ liệu");
        gender = InputHelper.yesNoHelper("Chọn giới tính(1: đực | 2: cái)", "Chọn sai");
        sound = InputHelper.stringHelper("Nhập vào tiếng kêu của mèo: ", "", 0, 20);
    }

    public Cat(int id, String name, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract String makeCaterwaul();
    public boolean isMale() {
        return gender;
    }

}
