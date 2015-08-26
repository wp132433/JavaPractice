package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Korean extends Person {

    public Korean(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요");
    }

    @Override
    public void sayBye() {
        System.out.println("잘가요");
    }
}
