package pipeline.contexts;

import pipeline.Context;

public interface CpfContext extends Context {
    String getCpf();
    void setCpfValid(boolean valid);
}
