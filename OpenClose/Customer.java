public class Customer {
    private String name;
    private CalculateDiscount discountStrategy;

    public Customer(String name, CalculateDiscount discountStrategy) {
        this.name = name;
        this.discountStrategy = discountStrategy;
    }

    public double applyDiscount(double amount) {
        return amount - discountStrategy.calculateDiscount(amount);
    }

    public String getName() {
        return name;
    }
}