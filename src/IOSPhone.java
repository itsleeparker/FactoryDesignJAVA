public class IOSPhone implements  Os{
    private String details;
    public IOSPhone(String details){
        this.details = details;
    }

    public  void getDetails(){
        System.out.println(this.details);
    }

    public  void makeCall(){
        System.out.println("Making a call on Icaller");
    }

    public  void  makeVideoCall(){
        System.out.println("Making a call on face time ");
    }
}
