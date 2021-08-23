package se.nackademin.java20.solid._4isp.violation;

public class Elephant implements Animal {
    @Override
    public void run() {
        System.out.println("I am running super fast!");
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException("I cannot jump!");

    }
}
