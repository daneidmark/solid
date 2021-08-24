package se.nackademin.java20.solid._5dip.solution;

public class TextPrinter {
    private final Printer printer;

    public TextPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(String text) {
        printer.print(text);
    }
}
