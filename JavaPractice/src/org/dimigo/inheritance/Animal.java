package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("nam");
    }

    public void sleep() {
        System.out.println("col");
    }

    public void bark() {
        System.out.println("war");
    }

    @Override
    public String toString() {
        return "내이름은" + name + "입니다";
    }
}
