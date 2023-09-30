public class Senior implements LevelProgStrategy {
    @Override
    public int salary(int experienceAge) {
        return 100000 * 2 * experienceAge;
    }

    @Override
    public String whatCanIDO(String name) {
        return name + " be able to quickly learn and implement a new tool into a product be able to quickly learn and implement a new tool into a product";
    }
}
