public class Smartphone implements CallFeature, SMSFeature, WebFeature, PictureFeature {
    
    public void makeCall(String number){
        System.out.println("Calling " + number);
    }

    public void sendSMS(String number, String message){
        System.out.println("Texting " + number + message);
    }

    public void browseWeb(String url){
        System.out.println("Browsing " + url);
    }

    public void takePicture(){
        System.out.println("Taking picture");
    }
}