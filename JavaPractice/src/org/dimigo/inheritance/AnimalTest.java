package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class AnimalTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("호랑이");
        System.out.println(tiger.toString());
        tiger.bark();
        Dog dog = new Dog("멍멍이");
        System.out.println(dog.toString());
        dog.bark();
        Cat cat = new Cat("야옹이");
        System.out.println(cat.toString());
        cat.bark();
    }
}
