package view;

import lib.InputHelper;
import model.Cat;
import model.Cats;
import model.FemaleCat;
import model.MaleCat;
import services.CatController;
import services.CatService;

public class AppView {
    private final CatService catService;

    public AppView() {
        catService = new CatController();
    }

    public void start() {
        System.out.println("--------------------");
        System.out.println("Quản lý mèo cho mẹ");
        System.out.println("--------------------");

        int choice;

        do {
            displayMenu();
            choice = InputHelper.intHelper("Chọn một chức năng: ", "Không hợp lệ");

            switch (choice) {
                case 1:
                    //ddCat();
                    if (catService.addCat(new Cats())){
                        System.out.println("Thêm thành công");
                    }
                    else {
                        System.out.println("Thêm thất bại");
                    }
                    break;
                case 2:
                    //deleteCatById();
                    if(catService.deleteCatById(InputHelper.intHelper("Nhập vào id cần xóa: ", "Nhập sai kiểu dữ liệu"))){
                        System.out.println("Xóa thành công");
                    }
                    else{
                        System.out.println("Xóa thất bại");
                    }
                    break;
                case 3:
                    //displayAllCats();
                    if (catService.displayAllCats()){
                        System.out.println("");
                    }
                    else {
                        System.out.println("Không có dữ liệu mèo");
                    }
                    break;
                case 4:
                    //displayCatById();
                    if (catService.displayCatById(InputHelper.intHelper("Nhập vào id cần hiển thị: ", "Nhập sai kiểu dữ liệu"))){
                        System.out.println("Thay đổi tiếng kêu cho mèo thành công");
                    }
                    else {
                        System.out.println("Không thấy id mèo");
                    }
                    break;
                case 5:
                    //changeCatSoundById();
                    if (catService.changeCatSoundById(InputHelper.intHelper("Nhập vào id của mèo cần sửa tiếng kêu", "Kiểu dữ liệu không hợp lệ"),
                            InputHelper.stringHelper("Nhập vào tiếng kêu mới", "", 0, 20))){
                        System.out.println("");
                    }
                    else {
                        System.out.println("Không thấy id mèo");
                    };
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
        while (choice != 6);
    }

    private void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Thêm mèo.");
        System.out.println("2. Xóa mèo theo ID.");
        System.out.println("3. Hiển thị toàn bộ mèo.");
        System.out.println("4. Hiển thị mèo theo ID.");
        System.out.println("5. Thay đổi tiếng kêu theo ID.");
        System.out.println("6. Thoát chương trình.");
    }

//    private void addCat() {
//        int id = InputHelper.intHelper("Nhập vào ID cho mèo mới: ", "Không hợp lệ");
//        String name = InputHelper.stringHelper("Nhập tên cho mèo mới: ", "Lỗi độ dài", 1, 10);
//        int age = InputHelper.intHelper("Nhập vào tuổi của mèo mới: ", "Không hợp lệ");
//        boolean gender = InputHelper.yesNoHelper("Nhập giới tính cho mèo mới (1: đực | 2: cái): ", "Không hợp lệ");
//        Cat cat;
//        if (gender) {
//            cat = new MaleCat(id, name, age);
//        } else {
//            cat = new FemaleCat(id, name, age);
//        }
//
//        if (catService.addCat(cat)) {
//            System.out.println("Thêm mèo thành công.");
//        } else {
//            System.out.println("Mèo đã tồn tại với ID đã cho.");
//        }
//    }
//
//    private void deleteCatById() {
//        int id = InputHelper.intHelper("Nhập vào ID của mèo cần xóa: ", "Không hợp lệ");
//
//        if (catService.deleteCatById(id)) {
//            System.out.println("Mèo đã được xóa thành công.");
//        } else {
//            System.out.println("Không tìm thấy mèo với ID đã cho.");
//        }
//    }
//
//    private void displayAllCats() {
//        System.out.println("Danh sách mèo:");
//
//        for (Cat cat : catService.displayAllCats()) {
//            System.out.println("ID: " + cat.getId());
//            System.out.println("Tên: " + cat.getName());
//            System.out.println("Tuổi: " + cat.getAge());
//            System.out.println("Giới tính: " + (cat.isMale() ? "Đực" : "Cái"));
//            System.out.println("Tiếng kêu: " + cat.getSound());
//            System.out.println("--------------------");
//        }
//    }

    //    private void displayCatById(int id) {
//        id = InputHelper.intHelper("Nhập vào ID của mèo cần hiển thị: ", "Không hợp lệ");
//
//        if (catService.displayCatById(id)) {
//            // Phương thức displayCatById() của CatService sẽ hiển thị thông tin mèo
//        } else {
//            System.out.println("Không tìm thấy mèo với ID đã cho.");
//        }
//    }
//
// AppView class
    private void changeCatSoundById(int id, String newSound) {
        if (catService.changeCatSoundById(id, newSound)) {
            System.out.println("Thay đổi tiếng kêu thành công.");
        }
        else {
            System.out.println("Không tìm thấy mèo với ID đã cho.");
        }
    }

}
