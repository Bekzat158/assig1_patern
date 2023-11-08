package programmers;

import decorators.LevelProgStrategyDecorator;
import factory.Development;
import observer.Observer;

public class Programmer implements Observer {
    private LevelProgStrategyDecorator levelProgStrategyDecorator;
    public String name;
    public int experienceAge;
    public String toolName;
    public Development development;


    public Programmer(LevelProgStrategyDecorator levelProgStrategyDecorator, String name, int experienceAge, String toolName, Development development) {
        this.levelProgStrategyDecorator = levelProgStrategyDecorator;
        this.name = name;
        this.experienceAge = experienceAge;
        this.toolName = toolName;
        this.development = development;
    }

    public int salary() {
        return levelProgStrategyDecorator.salary(experienceAge);
    }

    public String whatCanIDO() {
        return development + "     " + levelProgStrategyDecorator.whatCanIDO(name);
    }

    @Override
    public String toString() {
        return
                whatCanIDO() + ". I use " + toolName + " . Salary is" + salary() + "tg";
    }

    @Override
    public void update(String version) {
        this.toolName = version;
    }
}
