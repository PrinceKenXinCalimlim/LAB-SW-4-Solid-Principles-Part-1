public class BasicPhone implements CallFeature, SMSFeature {

    public void makeCall(String number){
        System.out.println("Calling " + number);
    }

    public void sendSMS(String number, String message){
        System.out.println("Texting " + number + message);
    }
}