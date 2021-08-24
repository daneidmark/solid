package se.nackademin.java20.solid._2ocp.solution;

import java.util.List;

public class ValidatorService {
    private final List<Validator> validators;

    public ValidatorService(List<Validator> validators) {
        this.validators = validators;
    }

    public boolean validate(int quantity) {
        return validators.stream().allMatch(v -> v.isSatisfiedBy(quantity));
    }

}
