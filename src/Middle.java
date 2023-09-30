public class Middle implements LevelProgStrategy {
    @Override
    public int salary(int experienceAge) {
        return 100000 * experienceAge;
    }

    @Override
    public String whatCanIDO(String name) {
        return name + " be able to select several solutions to a given problem and find the optimal option";
    }
}
