public class Main {
    public static void main(String[] args) {
        Programmer l1 = new Programmer(new GolangDecorator(new Middle()), "Beka", 1);
        Programmer l2 = new Programmer(new PythonDecorator(new Senior()), "Artem", 3);
        Programmer l3 = new Programmer(new PythonDecorator(new GolangDecorator(new Junior())), "Saken", 5);
        Programmer l4 = new Programmer(new PythonDecorator(new NoCoderAdapter(new NoCoder())), "Era", 7);

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