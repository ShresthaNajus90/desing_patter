package Adapter_Design_Patter;

public class Charger implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Your Iphone is charging ....!!");
    }
}
