package se.nackademin.java20.solid._5dip.solution;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
