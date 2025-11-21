import pipeline.Pipeline;
import pipeline.contexts.CustomerContext;
import pipeline.contexts.UserContext;
import pipeline.stages.CreateCustomer;
import pipeline.stages.CreateUser;
import pipeline.stages.SendWelcomeEmail;
import pipeline.stages.ValidateAge;
import pipeline.stages.ValidateCpf;
import pipeline.stages.ValidateName;

public class Main {
    public static void main(String[] args) {
        runUser();
        runCustomer();
    }

    static void runUser() {
        final var userCtx = new UserContext("Fernando", 18);
        final var pipeline = new Pipeline()
                .add(new ValidateAge<>(new ValidateAge.MinMax(18, null)))
                .add(new ValidateName<>())
                .add(new CreateUser<>())
                .add(new SendWelcomeEmail<>());

        pipeline.run(userCtx);
    }

    static void runCustomer() {
        final var userCtx = new CustomerContext("Fernando", "38391639860", 30);
        final var pipeline = new Pipeline()
                .add(new ValidateAge<>(new ValidateAge.MinMax(18, 22)))
                .add(new ValidateName<>())
                .add(new ValidateCpf<>())
                .add(new CreateCustomer<>());

        pipeline.run(userCtx);
    }
}

