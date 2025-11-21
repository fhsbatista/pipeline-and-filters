package pipeline.contexts;

import pipeline.Context;

public interface ValidationNameContext extends Context {
    String getName();
    void setNameValid(boolean valid);
}
