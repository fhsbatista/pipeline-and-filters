package pipeline.stages;

import pipeline.Context;
import pipeline.Stage;
import pipeline.contexts.CpfContext;

public class ValidateCpf<C extends CpfContext> implements Stage<C> {

    @Override
    public Context process(CpfContext ctx) {
        final var cpf = ctx.getCpf();
        final var isValid = cpf != null && !cpf.trim().isEmpty();
        ctx.setCpfValid(isValid);
        return ctx;
    }

}

