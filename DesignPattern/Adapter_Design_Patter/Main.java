package Adapter_Design_Patter;

public class Main {

    public static void main(String[] args){
        System.out.println("Program started.................!!");

        AppleCharger appleCharger = new AdapterCharger(new AdCharger());
        Iphone iphone = new Iphone(appleCharger);
        iphone.chargeIphone();
    }
}
