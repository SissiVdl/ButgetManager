import budget.BudgetManager;
import budget.Purchase;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BudgetManager budgetManager = new BudgetManager();

        // Get list of purchases from the input
        List<Purchase> purchaseList = BudgetManager.getPurchaseList();

        // calculate total price of purchases
        BudgetManager.calculateTotalExpense(purchaseList);
    }
}