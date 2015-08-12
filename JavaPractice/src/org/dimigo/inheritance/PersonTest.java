package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 7. 13..
 */
public class PersonTest {
	public static void main(String[] args) {
        Korean korean = new Korean();
        Japenese japenese = new Japenese();
        Chinese chinese = new Chinese();

        korean.sayHello();
        korean.sayBye();

        japenese.sayHello();
        japenese.sayBye();

        chinese.sayHello();
        chinese.sayBye();
	}
}
