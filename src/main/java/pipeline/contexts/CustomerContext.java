package pipeline.contexts;

public class CustomerContext implements AgeContext, NameContext, ValidationNameContext, CpfContext {
    private final String name;
    private final String cpf;
    private final int age;
    private boolean isAgeValid;
    private boolean isNameValid;
    private boolean isCpfValid;

    public CustomerContext(String name, String cpf, int age) {
        this.name = name;
        this.cpf = cpf;
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
        return isAgeValid && isNameValid && isCpfValid;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpfValid(boolean valid) {
        isCpfValid = valid;
    }
}
