package services;

import java.util.ArrayList;
import java.util.List;
import model.Cat;

public class CatController implements CatService {
    private List<Cat> cats;

    public CatController() {
        this.cats = new ArrayList<>();
    }

    @Override
    public boolean addCat(Cat inputCat) {
        for (Cat cat : cats) {
            if (cat.getId() == inputCat.getId()) {
                return false;
            }
        }
        cats.add(inputCat);
        return true;
    }

    @Override
    public boolean deleteCatById(int inputId) {
        for (Cat cat : cats) {
            if (cat.getId() == inputId) {
                cats.remove(cat);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean displayAllCats() {
        if (cats.size() == 0) {
            return false;
        } else {
            for (Cat cat : cats) {
                System.out.println("ID: " + cat.getId());
                System.out.println("Tên: " + cat.getName());
                System.out.println("Tuổi: " + cat.getAge());
                System.out.println("Giới tính: " + (cat.isMale() ? "Đực" : "Cái"));
                System.out.println("Tiếng kêu: " + cat.getSound());
                System.out.println("--------------------");
            }
        }
        return true;
    }

    @Override
    public boolean displayCatById(int inputId) {
        for (Cat cat : cats) {
            if (cat.getId() == inputId) {
                System.out.println("ID: " + cat.getId());
                System.out.println("Tên: " + cat.getName());
                System.out.println("Tuổi: " + cat.getAge());
                System.out.println("Giới tính: " + (cat.isMale() ? "Đực" : "Cái"));
                System.out.println("Tiếng kêu: " + cat.getSound());
                System.out.println("--------------------");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean changeCatSoundById(int inputId, String newSound) {
        for (Cat cat : cats) {
            if (cat.getId() == inputId) {
                cat.setSound(newSound);
                return true;
            }
        }
        return false;
    }
}
