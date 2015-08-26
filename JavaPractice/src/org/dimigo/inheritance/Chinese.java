package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Chinese extends Person{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("니하오");
    }

    @Override
    public void sayBye() {
        System.out.println("짜이찌엔");
    }
}

