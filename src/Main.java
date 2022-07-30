/*
*       Wap to let user buy a phone and this phone must perform some features such as make a call and video call
*       Depending upon the os of the phones these features may vary and needs to be overidden depeding on OS
*       Use Factory design pattern to generate the phone according to users needs!!
*
* */

import  java.util.*;
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Initiate the phone buy app
        Os userPhone;
        BuyPhone phone  = new BuyPhone();
        userPhone = phone.getPhone();
        userPhone.getDetails();
        userPhone.makeCall();
        userPhone.makeVideoCall();
    }
}