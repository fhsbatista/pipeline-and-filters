package pipeline.contexts;

import pipeline.Context;

public interface AgeContext extends Context {
    Integer getAge();
    void setAgeValid(boolean valid);
}
