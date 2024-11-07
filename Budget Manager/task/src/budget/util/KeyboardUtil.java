package budget.util;

import budget.Purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyboardUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput() {

        return scanner.nextLine();
    }

    public static boolean hasNextLine() {

        return scanner.hasNextLine();
    }
}