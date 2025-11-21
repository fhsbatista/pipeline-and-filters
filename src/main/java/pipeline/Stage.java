package pipeline;

public interface Stage<C extends Context> {
    Context process(C ctx);
}

