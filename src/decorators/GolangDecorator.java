package decorators;

import programmers.LevelProgStrategy;

public class GolangDecorator extends LevelProgStrategyDecorator {
    public GolangDecorator(LevelProgStrategy wrappee) {
        super(wrappee);
    }

    @Override
    public int salary(int experienceAge) {
        return (int) (super.salary(experienceAge) * 1.35);
    }

    @Override
    public String whatCanIDO(String name) {
        return super.whatCanIDO(name) + "___I can write code in Golang";
    }
}
