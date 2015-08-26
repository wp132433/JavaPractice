package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 7. 13..
 */
public class PersonTest {
	public static void main(String[] args) {
        Korean korean = new Korean("aa");
        Japenese japenese = new Japenese("33");
        Chinese chinese = new Chinese("Ee");

        Person[] persons = new Person[3];

        persons[0] = korean;
        persons[1] = japenese;
        persons[2] = chinese;

        for(Person person : persons) {
            System.out.println(person.toString());
            hello(person);
        }
    }

    static void hello(Person _person) {
        _person.sayHello();
    }
}
