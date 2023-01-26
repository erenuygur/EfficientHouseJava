package lessons.oop.intro.randomclass;

public class Example {
    public static void main(String[] args)
    {
        java.util.Random r = new  java.util.Random();
        java.util.Scanner kb = new  java.util.Scanner(System.in);


        System.out.print("How many random numbers do you want:  ");
        int n = Integer.parseInt(kb.nextLine());

        System.out.print("Begin index: ");
        int begin = Integer.parseInt(kb.nextLine());

        System.out.print("End index (exclusive) : ");
        int end = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i) {
            System.out.println(r.nextInt(begin, end));
        }

        System.out.println("----------------------");

        for (int i = 0; i < n; ++i) {
            System.out.println(r.nextInt(end - begin) + begin);
        }

    }
}
