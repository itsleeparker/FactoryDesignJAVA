public class PhoneFactory {
    private String PhoneType;
    public PhoneFactory(String Phone){
        this.PhoneType = Phone;
    }

    public Os getInstance(){
        switch(this.PhoneType){
            case "ANDROID":
                return new AndroidPhone("This is an Android Phone with latest Android 12");

            case "IPHONE":
                    return new IOSPhone("This is an IOS Phone with IOS 21.0.12");

            default:
                    System.out.println("Wrong Phone Chosen !!");
                break;
        }
        return null;
    }
}
