package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("war");
    }
}
