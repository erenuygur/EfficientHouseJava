package lessons.oop.basics.randomclass;


public class Intro extends Object{
    public static void main(String[] args)
    {
        java.util.Random r = new java.util.Random();

        for (int i = 0; i < 10; ++i)
            System.out.println(r.nextInt());

        System.out.println("-----------------------");

        for (int i = 0; i < 10; ++i)
            System.out.println(r.nextInt(10)); // [0, 10)

        System.out.println("-----------------------");

        for (int i = 0; i < 10; ++i)
            System.out.println(r.nextInt(10, 100)); // since Java 17 with (RandomGenerator interface)

        System.out.println("-----------------------");

        for (int i = 0; i < 10; ++i)
            System.out.println(r.nextInt(90) + 10); // [0, 90) + 10 -> [0, 100]

        for (int i = 0; i < 10; ++i)
            System.out.println(r.nextInt(20)- 5); // [0, 20) - 5 -> [-5, 15)

    }
}
