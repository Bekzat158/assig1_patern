package programmers;

public class Junior implements LevelProgStrategy {
    @Override
    public int salary(int experienceAge) {
        return (int) (100000 * 0.5 * experienceAge);
    }

    @Override
    public String whatCanIDO(String name) {
        return name + " is Junior";
    }
}
