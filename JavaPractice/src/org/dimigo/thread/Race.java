package org.dimigo.thread;

/**
 * Created by WOF on 2015. 11. 4..
 */
public class Race {
    public static void main(String[] args) {
        Runner runner1 = new Runner("정욱재");
        Runner runner2 = new Runner("이어진");

        runner1.setPriority(Thread.MAX_PRIORITY);
        runner2.setPriority(Thread.MIN_PRIORITY);

        runner1.start();
        runner2.start();
    }
}
