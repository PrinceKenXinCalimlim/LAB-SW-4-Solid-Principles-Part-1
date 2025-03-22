public class PhoneDemo {
    public static void main(String[] args) {
        System.out.println("BasicPhone:");
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.makeCall("+1234567890");
        basicPhone.sendSMS("+0987654321", "Hello! I am texting from BasicPhone!");
        
        System.out.println("\nSmartPhone:");
        Smartphone smartPhone = new Smartphone();
        smartPhone.makeCall("+5566778899");
        smartPhone.sendSMS("+5566778899", "Hello! I am texting from SmartPhone!");
        smartPhone.browseWeb("https://www.nba.com");
        smartPhone.takePicture();
    }
}