package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 25..
 */
public class iPhone extends SmartPhone {
    public iPhone() {
    }

    public iPhone(String model, String company, int price) {
        super(model, company, price);
    }

    public void pay() {
        System.out.println("apple pay");
    }

    public void useAirDrop() {
        System.out.println("air drop");
    }
}
