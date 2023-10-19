public class NoCoderAdapter implements LevelProgStrategy {
    private NoCoder noCoder;

    public NoCoderAdapter(NoCoder noCoder) {
        this.noCoder = noCoder;
    }

    @Override
    public int salary(int experienceAge) {
        return noCoder.wages(experienceAge);
    }

    @Override
    public String whatCanIDO(String name) {
         return  noCoder.whatSkill(name);
    }
}
