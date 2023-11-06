package observer;

import programmers.Programmer;

import java.util.List;

public class Department implements Observer {
    String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<Programmer> programmers) {
        System.out.println("Observer.Department " + name + " need programers:\n" + programmers + "\n\n");
    }

}
