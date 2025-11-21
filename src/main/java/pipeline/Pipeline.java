package pipeline;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {

    private final List<Stage> stages = new ArrayList<>();

    public Pipeline add(Stage stage) {
        stages.add(stage);
        return this;
    }

    public Context run(Context ctx) {
        Context current = ctx;
        for (Stage s : stages) {
            current = s.process(current);
        }
        return current;
    }
}

