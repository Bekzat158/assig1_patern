package decorators;
import programmers.LevelProgStrategy;
public class JavaDecorator extends LevelProgStrategyDecorator {
    public JavaDecorator(LevelProgStrategy wrappee) {
        super(wrappee);
    }

    @Override
    public int salary(int experienceAge) {
        return (int) (super.salary(experienceAge)*1.25);
    }

    @Override
    public String whatCanIDO(String name) {
        return super.whatCanIDO(name)+"___I can write code in Java";
    }
}
