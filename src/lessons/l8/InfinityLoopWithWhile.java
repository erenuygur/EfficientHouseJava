package lessons.l8;

public class InfinityLoopWithWhile {
    public static void main(String[] args)
    {
        byte number = 1;

        while (number > 0) {
            System.out.println("Its not infinite");
            ++number;
            System.out.println(number);
        }

        while (true) {
            System.out.println("Its infinite ;)");
            ++number;
            System.out.println(number);

            if (number == 127)
                return;
        }
    }
}
