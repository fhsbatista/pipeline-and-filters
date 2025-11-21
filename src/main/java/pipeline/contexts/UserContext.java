package pipeline.contexts;

public class UserContext implements
        AgeContext,
        NameContext,
        ValidationNameContext,
        SendWelcomeEmailContext {

    private final String name;
    private final int age;
    private boolean isAgeValid;
    private boolean isNameValid;

    public UserContext(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAgeValid(boolean valid) {
        isAgeValid = valid;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setNameValid(boolean valid) {
        isNameValid = valid;
    }

    public boolean isValid() {
        return isAgeValid && isNameValid;
    }
}
