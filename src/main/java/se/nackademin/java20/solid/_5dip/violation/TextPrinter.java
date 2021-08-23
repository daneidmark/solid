package se.nackademin.java20.solid._5dip.violation;

public class TextPrinter {
    private final ConsolePrinter consolePrinter;

    public TextPrinter(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void print(String text) {
        consolePrinter.print(text);
    }
}
