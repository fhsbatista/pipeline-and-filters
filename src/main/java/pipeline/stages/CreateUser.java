package pipeline.stages;

import pipeline.Context;
import pipeline.Stage;
import pipeline.contexts.UserContext;

public class CreateUser<C extends UserContext> implements Stage<C> {

    @Override
    public Context process(UserContext ctx) {
        if (!ctx.isValid()) {
            throw new RuntimeException("Usuário inválido");
        }

        final var name = ctx.getName();
        final var age = ctx.getAge();

        System.out.printf("\nUsuário criado. Name: %s, Idade: %s", name, age);

        return ctx;
    }
}

