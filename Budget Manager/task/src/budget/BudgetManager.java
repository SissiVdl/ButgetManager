package budget;

import budget.util.KeyboardUtil;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager {

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
