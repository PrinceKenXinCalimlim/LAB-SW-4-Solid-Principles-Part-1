public class SeniorDiscount implements CalculateDiscount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;// 10% Discount for Senior Citizens
    }
}