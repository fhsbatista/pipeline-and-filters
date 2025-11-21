package pipeline.stages;

import pipeline.Context;
import pipeline.Stage;
import pipeline.contexts.AgeContext;

import java.util.Objects;

public class ValidateAge<C extends AgeContext> implements Stage<C> {
    private final Integer minimumAge;
    private final Integer maximumAge;

    public ValidateAge(final MinMax minMax) {
        this.minimumAge = minMax.min;
        this.maximumAge = minMax.max;
    }

    @Override
    public Context process(AgeContext ctx) {
        final var age = ctx.getAge();

        if (minimumAge != null && age < minimumAge) {
            ctx.setAgeValid(false);
            return ctx;
        }

        if (maximumAge != null && age > maximumAge) {
            ctx.setAgeValid(false);
            return ctx;
        }

        ctx.setAgeValid(true);
        return ctx;
    }

    public record MinMax(Integer min, Integer max) {}

}

