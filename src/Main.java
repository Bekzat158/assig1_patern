import factory.Development;
import factory.DevelopmentFactory;
import factory.DevelopmentCode;
import decorators.GolangDecorator;
import decorators.PythonDecorator;
import programmers.Junior;
import programmers.Senior;
import programmers.Middle;
import programmers.Programmer;
import programmers.adapter.NoCoder;
import programmers.adapter.NoCoderAdapter;

public class Main {
    public static void main(String[] args) {
        Application app = Application.getInstance();

        Development development1 = DevelopmentFactory.createDevelopment(DevelopmentCode.DATABASE);
        Programmer p1 = new Programmer(new GolangDecorator(new Middle()), "Beka", 1, "intelliJIdea", development1);
        app.addProgrammer("intelliJIdea", p1);

        Development development2 = DevelopmentFactory.createDevelopment(DevelopmentCode.WEB);
        Programmer p2 = new Programmer(new PythonDecorator(new Senior()), "Artem", 3, "visualStudio", development2);
        app.addProgrammer("visualStudio",p2);

        Development development3 = DevelopmentFactory.createDevelopment(DevelopmentCode.UxUI);
        Programmer p3 = new Programmer(new PythonDecorator(new NoCoderAdapter(new NoCoder())), "Era", 7,"intelliJIdea",development3);
        app.addProgrammer("intelliJIdea",p3);


        Development development4 = DevelopmentFactory.createDevelopment(DevelopmentCode.DATABASE);
        Programmer p4 = new Programmer(new PythonDecorator(new GolangDecorator(new Junior())), "Saken", 5,"visualStudio",development4);
        app.addProgrammer("visualStudio",p4);


        app.updateIDEVersion("intelliJIdea", "2023.1");
        app.printProgrammerInfo(p1);
        app.updateIDEVersion("intelliJIdea", "2023.5");
        app.printProgrammerInfo(p1);
        app.printProgrammerInfo(p3);
        app.printProgrammerInfo(p2);
        app.printProgrammerInfo(p4);
        app.removeProgrammer("visualStudio",p4);
        app.updateIDEVersion("visualStudio", "1.55");
        app.printProgrammerInfo(p2);
        app.printProgrammerInfo(p4);




    }
}