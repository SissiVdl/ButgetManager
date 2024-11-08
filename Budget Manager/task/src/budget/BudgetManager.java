package budget;

import budget.util.KeyboardUtil;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager {

    int totalIncome;
    List<Purchase> purchaseList;
    double totalExpense;
    double balance;

    public BudgetManager() {
        this.totalIncome = 0;
        this.purchaseList = new ArrayList<>();
        this.totalExpense = 0;
        this.balance = getBalance();
    }

    private double getBalance() {
        return this.totalIncome - this.totalExpense;
    }

    private static String menu() {
        return """
                Choose your action:
                1) Add income
                2) Add Purchase
                3) Show the list of purchases
                4) Balance
                0) Exit""";
    }

    public void chooseAction() {
        boolean keepGoing = true;
        while (keepGoing) {
            int choice = KeyboardUtil.getNumber(menu());
            switch (choice) {
                case 1:
                    int income = KeyboardUtil.getNumber("\nEnter income:");
                    this.totalIncome += income;
                    System.out.println("Income was added!\n");
                    System.out.println("New income: " + income + "\n");
                    System.out.println("Total income: " + this.totalIncome + "\n");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("Total income: " + this.totalIncome + " Total expence: " + this.totalExpense + "\n");
                    System.out.println("\nBalance:" + String.format("%.2f", getBalance()) + "\n");
                    break;
                case 0:
                    keepGoing = false;
            }
        }
    }

    public static void calculateTotalExpense(List<Purchase> purchaseList) {
        double total = 0;

        for (Purchase p : purchaseList) {
            System.out.println(p.getName() + " $" + String.format("%.2f",p.getPrice()));
            total += p.getPrice();
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }

    public static List<Purchase> getPurchaseList() {
        List<Purchase> purchaseList = new ArrayList<>();

        while (KeyboardUtil.hasNextLine()) {
            String purchase = KeyboardUtil.getInput();
            purchaseList.add(new Purchase(purchase));
        }
        return purchaseList;
    }
}
