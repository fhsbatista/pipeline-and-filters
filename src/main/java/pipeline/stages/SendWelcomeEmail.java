package pipeline.stages;

import pipeline.Context;
import pipeline.Stage;
import pipeline.contexts.SendWelcomeEmailContext;

public class SendWelcomeEmail<C extends SendWelcomeEmailContext> implements Stage<C> {

    @Override
    public Context process(SendWelcomeEmailContext ctx) {
        System.out.printf("\nEmail enviado para pessoa de nome: %s", ctx.getName());
        return ctx;
    }
}
