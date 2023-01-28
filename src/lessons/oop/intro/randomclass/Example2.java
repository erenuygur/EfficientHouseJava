package lessons.oop.intro.randomclass;

public class Example2 {
    public static void main(String[] args)
    {
        java.util.Random r = new java.util.Random();

        for (int i = 0; i < 5; ++i)
            System.out.println(r.nextLong());

        System.out.println("------------------------");

        for (int i = 0; i < 5; ++i)
            System.out.println(r.nextLong(1_000_000_000_000L)); //  [0, 1_000_000_000_000L)

        System.out.println("------------------------");

        for (int i = 0; i < 5; ++i)
            System.out.println(r.nextDouble() * 3 + 80); // [80, 83)

        System.out.println("------------------------");

        for (int i = 0; i < 5; ++i)
            System.out.println(r.nextDouble(80, 83));

        System.out.println("------------------------");

        for (int i = 0; i < 5; ++i)
            System.out.println(r.nextBoolean());


    }
}
