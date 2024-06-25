package Adapter_Design_Patter;

public class AdapterCharger  implements AppleCharger{

    private AndoridCharger andoridCharger;

    public AdapterCharger(AndoridCharger andoridCharger) {
        this.andoridCharger = andoridCharger;
    }

    @Override
    public void chargePhone() {
        andoridCharger.chargeAndroidPhone();
        System.out.println("Your Phone charging using Adapter............!!");
    }
}
