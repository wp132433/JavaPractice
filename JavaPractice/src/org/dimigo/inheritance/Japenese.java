package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Japenese extends Person {

    public Japenese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("곤니치와");
    }

    @Override
    public void sayBye() {
        System.out.println("사요나라");
    }
}
