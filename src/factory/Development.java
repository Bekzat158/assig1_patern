package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Development {
    protected List<Knowledge> knowledges = new ArrayList<>();

    public Development() {
        createDevelopment();
    }

    protected abstract void createDevelopment();

    @Override
    public String toString() {
        return "Development{" + knowledges +
                '}';
    }
}
