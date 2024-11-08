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
                    addIncome();
                    break;
                case 2:
                    addPurchase();
                    break;
                case 3:
                    showPurchases();
                    break;
                case 4:
                    System.out.println("\nBalance: $" + String.format("%.2f", getBalance()) + "\n");
                    break;
                case 0:
                    System.out.println("\nBye!");
                    keepGoing = false;
            }
        }
    }

    private void addIncome() {
        int income = KeyboardUtil.getNumber("\nEnter income:");
        this.totalIncome += income;
        System.out.println("Income was added!\n");
    }

    private void addPurchase() {
        String name = KeyboardUtil.getInput("\nEnter purchase name:");
        double price = KeyboardUtil.getDouble("Enter its price:");
        Purchase p = new Purchase(name, price);
        purchaseList.add(p);
        this.totalExpense += p.getPrice();
        System.out.println("Purchase was added!\n");
    }

    public double getBalance() {
        return this.totalIncome - this.totalExpense;
    }
    public void showPurchases() {

        if (this.purchaseList.isEmpty()) {
            System.out.println("\nThe purchase list is empty\n");
            return;
        }
        System.out.println("\n");
        for (Purchase p : this.purchaseList) {
            System.out.println(p.getName() + " $" + String.format("%.2f",p.getPrice()));
        }
        System.out.println("Total sum: $" + String.format("%.2f", this.totalExpense) + "\n");
    }
}
