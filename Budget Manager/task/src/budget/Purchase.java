package budget;

public class Purchase {
    private final String name;
    private final double price;

    public Purchase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Purchase(String purchase) {
        this.name = setName(purchase);
        this.price = setPrice(purchase);
    }

    private static String setName(String purchase) {
        String[] purchaseParts = purchase.split(" ");
        return purchase.substring(0, purchase.length() - purchaseParts[purchaseParts.length - 1].length() - 1);
    }

    private static double setPrice(String purchase) {
        String[] purchaseParts = purchase.split(" ");
        return Double.parseDouble(purchaseParts[purchaseParts.length - 1].substring(1));
    }

    public String getName() {

        return name;
    }

    public double getPrice() {
        return price;
    }
}
