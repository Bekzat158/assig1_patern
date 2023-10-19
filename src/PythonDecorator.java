public class PythonDecorator extends LevelProgStrategyDecorator{
    public PythonDecorator(LevelProgStrategy wrappee) {
        super(wrappee);
    }

    @Override
    public int salary(int experienceAge) {
        return (int) (super.salary(experienceAge)*1.2);
    }

    @Override
    public String whatCanIDO(String name) {
        return super.whatCanIDO(name)+"________I can write code in Python";
    }
}
