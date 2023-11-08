package programmers;

public class Senior implements LevelProgStrategy {
    @Override
    public int salary(int experienceAge) {
        return 100000 * 2 * experienceAge;
    }

    @Override
    public String whatCanIDO(String name) {
        return name + " is Senior";
    }
}
