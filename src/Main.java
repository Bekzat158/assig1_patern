import factory.Development;
import factory.DevelopmentFactory;
import factory.DevelopmentCode;
import observer.Company;
import observer.Department;
import decorators.GolangDecorator;
import decorators.PythonDecorator;
import programmers.Junior;
import programmers.Middle;
import programmers.Programmer;
import programmers.Senior;
import programmers.adapter.NoCoder;
import programmers.adapter.NoCoderAdapter;

public class Main {
    public static void main(String[] args) {
        Development development1 = DevelopmentFactory.createDevelopment(DevelopmentCode.DATABASE);
        Programmer l1 = new Programmer(new GolangDecorator(new Middle()), "Beka", 1,development1);
        Development development2 = DevelopmentFactory.createDevelopment(DevelopmentCode.WEB);
        Programmer l2 = new Programmer(new PythonDecorator(new Senior()), "Artem", 3,development2);
        Programmer l3 = new Programmer(new PythonDecorator(new GolangDecorator(new Junior())), "Saken", 5,development2);
        Development development4 = DevelopmentFactory.createDevelopment(DevelopmentCode.UxUI);
        Programmer l4 = new Programmer(new PythonDecorator(new NoCoderAdapter(new NoCoder())), "Era", 7,development4);

        Company aitu = new Company();
        aitu.addProgrammer(l1);
        aitu.addObserver(new Department("Math"));
        aitu.addProgrammer(l3);
        aitu.addProgrammer(l4);
        aitu.addProgrammer(l1);
        aitu.addObserver(new Department("Finance"));
        aitu.notifyObservers();
    }
}