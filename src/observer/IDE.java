package observer;

import programmers.Programmer;

import java.util.ArrayList;
import java.util.List;

public class IDE implements Observed {
    String name, version;
    private List<Programmer> programmers = new ArrayList<>();

    public IDE(String name, String version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public void addProgrammer(Programmer programmer) {
        programmer.toolName=this.name+version;
        programmers.add(programmer);
    }

    @Override
    public void removeProgrammer(Programmer programmer) {
        programmers.remove(programmer);
    }

    public void updateVersion(String version) {
        notifyProgrammers(version);
    }

    @Override
    public void notifyProgrammers(String version) {
        for (Programmer programmer : programmers) {
            programmer.update(this.name + version);
        }
    }
}