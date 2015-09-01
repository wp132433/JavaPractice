package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 25..
 */
abstract class SmartPhone {
    String model;
    String company;
    int price;

    public SmartPhone() {
    }

    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void turnOn() {
        System.out.println(model + "on");
    }

    public void turnOff() {
        System.out.println(model + "off");
    }

    abstract void pay();

    public void useSpecialFunction() {
        if(this instanceof iPhone)
            ((iPhone)this).useAirDrop();
        if(this instanceof Galaxy)
            ((Galaxy)this).useWirelessCharging();

    }

    @Override
    public String toString() {
        return model + "  " + company + "  " + price;
    }
}
