public class Main {
    public static void main(String[] args) {
        Programmer l1 = new Programmer(new Junior(), "Beka", 1);
        Programmer l2 = new Programmer(new Middle(), "Zhan", 3);
        Programmer l3 = new Programmer(new Senior(), "Nur", 5);

        System.out.println(l1.salary()+" tg "+ l1.whatCanIDO());
        System.out.println(l2.salary()+" tg "+ l2.whatCanIDO());
        System.out.println(l3.salary()+" tg "+ l3.whatCanIDO());

    }
}