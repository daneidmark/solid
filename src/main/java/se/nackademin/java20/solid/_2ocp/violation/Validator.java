package se.nackademin.java20.solid._2ocp.violation;

public class Validator {

    public boolean validate(int quantity) {
        if (quantity < 0) return false;
        if (quantity > 100) return false;
        return true;
    }

}
