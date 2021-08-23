package se.nackademin.java20.solid._4isp.violation;

public class Tiger implements Animal {
    @Override
    public void run() {
        System.out.println("Like the speed of light!");
    }

    @Override
    public void jump() {
        System.out.println("Jumping highest of them all!");

    }
}
