public class Programmer {
    private LevelProgStrategyDecorator levelProgStrategyDecorator;
    public String name;
    public int experienceAge;

    public Programmer(LevelProgStrategyDecorator levelProgStrategyDecorator, String name, int experienceAge) {
        this.levelProgStrategyDecorator = levelProgStrategyDecorator;
        this.name = name;
        this.experienceAge = experienceAge;
    }
    public int salary(){
        return levelProgStrategyDecorator.salary(experienceAge);
    }

    public String whatCanIDO(){
        return levelProgStrategyDecorator.whatCanIDO(name);
    }
}
