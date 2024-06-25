package Adapter_Design_Patter;

public class AdCharger implements AndoridCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("your android phone charging");
    }
}
