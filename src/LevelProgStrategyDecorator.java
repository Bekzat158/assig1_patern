public class LevelProgStrategyDecorator  implements LevelProgStrategy{
    private LevelProgStrategy  wrappee;

    public LevelProgStrategyDecorator(LevelProgStrategy wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public int salary(int experienceAge) {
        return wrappee.salary(experienceAge);
    }

    @Override
    public String whatCanIDO(String name) {
        return wrappee.whatCanIDO(name);
    }
}
