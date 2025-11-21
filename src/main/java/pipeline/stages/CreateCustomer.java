package pipeline.stages;

import pipeline.Context;
import pipeline.Stage;
import pipeline.contexts.CustomerContext;

public class CreateCustomer<C extends CustomerContext> implements Stage<C> {

    @Override
    public Context process(CustomerContext ctx) {
        if (!ctx.isValid()) {
            throw new RuntimeException("Cliente inválido");
        }

        final var name = ctx.getName();
        final var age = ctx.getAge();
        final var cpf = ctx.getCpf();

        System.out.printf("\nCliente criado. Name: %s, Idade: %s, CPF: %s", name, age, cpf);

        return ctx;
    }
}

