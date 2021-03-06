package se.nackademin.java20.solid._3lsp.violation;

public class Square extends Rectangle {
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

}
