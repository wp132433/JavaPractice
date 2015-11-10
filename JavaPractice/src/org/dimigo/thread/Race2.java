package org.dimigo.thread;

/**
 * Created by WOF on 2015. 11. 4..
 */
public class Race2 {
    public static void main(String[] args) {
        Runner2 runner1 = new Runner2("정욱재");
        Runner2 runner2 = new Runner2("이어진");

        runner1.run();
        runner2.run();
    }
}
