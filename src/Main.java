public class Main {
    public static void main(String[] args) {
        Programmer l1 = new Programmer(new GolangDecorator(new Middle()), "Beka", 1);
        Programmer l2 = new Programmer(new PythonDecorator(new Senior()), "Artem", 3);
        Programmer l3 = new Programmer(new PythonDecorator(new GolangDecorator(new Junior())), "Saken", 5);

        Programmer ass3 = new Programmer(new PythonDecorator(new NoCoderAdapter(new NoCoder())), "Era", 7);

        System.out.println(l1.salary() + " tg " + l1.whatCanIDO() + '\n');
        System.out.println(l2.salary() + " tg " + l2.whatCanIDO() + '\n');
        System.out.println(l3.salary() + " tg " + l3.whatCanIDO() + '\n');

        System.out.println(ass3.salary() + " tg " + ass3.whatCanIDO());
    }
}