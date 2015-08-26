package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("a wog");
    }
}
