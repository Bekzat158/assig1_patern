package programmers;

public class Middle implements LevelProgStrategy {
    @Override
    public int salary(int experienceAge) {
        return 100000 * experienceAge;
    }

    @Override
    public String whatCanIDO(String name) {
        return name + " is Middle";
    }
}