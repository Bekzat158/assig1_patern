public class Programmer {
    private LevelProgStrategy levelProgStrategy;
    public String name;
    public int experienceAge;

    public Programmer(LevelProgStrategy levelProgStrategy, String name, int experienceAge) {
        this.levelProgStrategy = levelProgStrategy;
        this.name = name;
        this.experienceAge = experienceAge;
    }
    public int salary(){
        return levelProgStrategy.salary(experienceAge);
    }

    public String whatCanIDO(){
        return levelProgStrategy.whatCanIDO(name);
    }
}
