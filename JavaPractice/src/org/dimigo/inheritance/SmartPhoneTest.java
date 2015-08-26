package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 26..
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        iPhone phone;
        Galaxy galaxy;

        phone = new iPhone("6", "apple", 70);
        galaxy = new Galaxy("S6", "samsung", 65);

        System.out.println(phone.toString());
        System.out.println(galaxy.toString());

        phone.turnOn();
        phone.pay();
        phone.useAirDrop();
        phone.turnOff();

        galaxy.turnOn();
        galaxy.pay();
        galaxy.useWirelessCharging();
        galaxy.turnOff();
    }
}
