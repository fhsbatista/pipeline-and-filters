package pipeline.stages;

import pipeline.Context;
import pipeline.Stage;
import pipeline.contexts.ValidationNameContext;

public class ValidateName<C extends ValidationNameContext> implements Stage<C> {

    @Override
    public Context process(ValidationNameContext ctx) {
        final var name = ctx.getName();
        final var isValid = name != null && !name.trim().isEmpty();
        ctx.setNameValid(isValid);
        return ctx;
    }

}

