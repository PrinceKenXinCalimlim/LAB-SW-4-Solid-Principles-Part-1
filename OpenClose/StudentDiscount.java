public class StudentDiscount implements CalculateDiscount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;// 5% Discount for Students
    }
}