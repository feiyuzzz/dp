package strategy;

public class TestStrategy {

    public static void main(String[] args) {
        int a = 6, b = 6;
        var c1 = new Context(new AddOpt());
        System.out.println(c1.execute(a, b));

        var c2 = new Context(new SubOpt());
        System.out.println(c2.execute(a, b));

        var c3 = new Context(new MultOpt());
        System.out.println(c3.execute(a, b));
    }
}
