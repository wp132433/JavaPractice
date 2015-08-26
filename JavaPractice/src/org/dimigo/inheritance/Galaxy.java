package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 25..
 */
public class Galaxy extends SmartPhone {
    public Galaxy() {
    }

    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }

    public void pay() {
        System.out.println("samsung pay");
    }

    public void useWirelessCharging() {
        System.out.println("wireless charge");
    }
}
