package org.dimigo.thread;

/**
 * Created by WOF on 2015. 11. 4..
 */
public class Runner extends Thread{
    private String name;

    public Runner() {

    }

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "출발");

        int meter = 100;
        do {
            System.out.println(name + meter + " 미터");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while((meter -= 10) >= 0);


        System.out.println(name + "도착");
    }
}
