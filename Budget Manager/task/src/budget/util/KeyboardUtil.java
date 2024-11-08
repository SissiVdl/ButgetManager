package budget.util;

import budget.Purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyboardUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput() {

        String input = scanner.nextLine();
        return input;
    }

    public static String getInput(String message) {
        System.out.println(message);
        String input = getInput();
        return input;
    }

    public static int getNumber() {
        int number = scanner.nextInt();
        return number;
    }

    public static int getNumber(String message){
        System.out.println(message);
        int number = getNumber();
        scanner.nextLine();
        return number;
    }

    public static double getDouble() {
        double number = scanner.nextDouble();
        scanner.nextLine();
        return number;
    }

    public static double getDouble(String message) {
        System.out.println(message);
        return getDouble();
    }

    public static boolean hasNextLine() {

        return scanner.hasNextLine();
    }
}