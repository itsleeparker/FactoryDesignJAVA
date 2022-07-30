public class AndroidPhone implements  Os{
    private String details;
    public AndroidPhone(String details){
        this.details = details;
    }

    public void getDetails(){
        System.out.println(this.details);
    }

    public void makeCall(){
            System.out.println("Making Voice Call from Android App");
    }

    public  void makeVideoCall(){
            System.out.println("Making A Video call using Android App");
    }
}
