package observer;

import programmers.Programmer;

import java.util.ArrayList;
import java.util.List;

public class Company implements Observed {
    private List<Programmer> programmers = new ArrayList<>();
    private List<Observer> departments = new ArrayList<>();

    public void addProgrammer(Programmer programmer){
        programmers.add(programmer);
    }
    public void removeProgrammer(Programmer programmer){
        programmers.remove(programmer);
    }
    @Override
    public void addObserver(Observer department) {
        departments.add(department);
    }

    @Override
    public void removeObserver(Observer department) {
        departments.remove(department);
    }

    @Override
    public void notifyObservers() {
        for (Observer department: departments){
            department.handleEvent(programmers);
        }
    }
}