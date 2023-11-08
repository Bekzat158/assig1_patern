package observer;
import programmers.Programmer;

public interface Observed {
    public void addProgrammer(Programmer programmer);

    public void removeProgrammer(Programmer programmer);

    public void notifyProgrammers(String version);
}
