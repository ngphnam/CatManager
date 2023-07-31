package lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    /**
     *
     * @param mess tin nhắn cho người dùng
     * @param error lỗi
     * @return trả về int
     */
    public static int intHelper(String mess, String error) {
        System.out.println(mess);
        int value = 0;
        try {
            value = Integer.parseInt(sc.nextLine());
            return value;
        } catch (Exception e){
            System.out.println(error);
            return intHelper(mess, error);
        }
    }
    public static String stringHelper(String mess, String error, int minLength, int maxLenght) {
        System.out.println(mess);
        String input = sc.nextLine();
        if (input.trim().length() < minLength || input.trim().length() > maxLenght) {
            System.out.println(error);
            return stringHelper(mess, error, minLength, maxLenght);
        }
        return input;
    }

    public static LocalDate yobHelper(String mess, String error) {
        System.out.println(mess);
        LocalDate yob = null;
        try {
            yob = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return yob;
        } catch (Exception e) {
            System.out.println(error);
            return yobHelper(mess, error);
        }
    }
    public static double doubleHelper(String mess, String error) {
        System.out.println(mess);
        double value = Double.parseDouble(sc.nextLine());
        if (value < 0 || value > 10){
            System.out.println(error);
            return doubleHelper(mess, error);
        }
        return value;
    }

    public static boolean yesNoHelper(String mess, String error) {
        System.out.println(mess);
        int choice = Integer.parseInt(sc.nextLine());
        boolean value;
        if (choice == 1) {
            value = true;
        }
        else if (choice == 2) {
            value = false;
        }
        else {
            System.out.println(error);
            return yesNoHelper(mess, error);
        }
        return value;
    }
}
