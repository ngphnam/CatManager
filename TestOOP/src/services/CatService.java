package services;

import model.Cat;

import java.util.List;

public interface CatService {
    boolean addCat(Cat inputCat);

    boolean deleteCatById(int inputId);
    boolean displayAllCats();
    boolean displayCatById(int inputId);
    boolean changeCatSoundById(int inputId, String newSound);
}
