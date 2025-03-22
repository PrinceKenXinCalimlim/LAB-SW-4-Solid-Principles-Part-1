public class DiscountApp {
    
    public static void main(String[] args) {
        Customer student = new Customer("Alice", new StudentDiscount());
        Customer seniorCitizen = new Customer("Bob", new SeniorDiscount());
        Customer regular = new Customer("Charlie", new Regular());

        double amount = 100.0;

        System.out.println("Student Discount: " + student.applyDiscount(amount)); 
        System.out.println("Senior Citizen Discount: " + seniorCitizen.applyDiscount(amount)); 
        System.out.println("Regular Discount: " + regular.applyDiscount(amount)); 
    }
}