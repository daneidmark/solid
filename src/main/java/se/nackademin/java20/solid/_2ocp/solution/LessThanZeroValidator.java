package se.nackademin.java20.solid._2ocp.solution;

public class LessThanZeroValidator implements Validator {
    public boolean isSatisfiedBy(int value) {
        return value < 0;
    }
}
