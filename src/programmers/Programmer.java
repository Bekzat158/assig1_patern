package programmers;

import decorators.LevelProgStrategyDecorator;
import factory.Development;

public class Programmer {
    private LevelProgStrategyDecorator levelProgStrategyDecorator;
    public String name;
    public int experienceAge;
    public Development development;


    public Programmer(LevelProgStrategyDecorator levelProgStrategyDecorator, String name, int experienceAge, Development development) {
        this.levelProgStrategyDecorator = levelProgStrategyDecorator;
        this.name = name;
        this.experienceAge = experienceAge;
        this.development = development;
    }

    public int salary() {
        return levelProgStrategyDecorator.salary(experienceAge);
    }

    public String whatCanIDO() {
        return development + "######" + levelProgStrategyDecorator.whatCanIDO(name);
    }

    @Override
    public String toString() {
        return
                whatCanIDO() + " " + salary() + "tg";
    }
}
