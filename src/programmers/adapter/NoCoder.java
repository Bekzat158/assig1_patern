package programmers.adapter;

public class NoCoder {
    public int wages(int experienceAge) {
        return (int) (100000 * 0.7 * experienceAge);
    }

    public String whatSkill(String name) {
        return name + " Capable of swiftly mastering and seamlessly integrating new tools into products.";
    }

}
