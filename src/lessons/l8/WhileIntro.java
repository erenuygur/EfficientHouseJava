package lessons.l8;

public class WhileIntro {
    public static void main(String[] args) {
        /*
            while (<condition>) // true
                <statements>
         */

        int count = 0;

        if (count < 5) {
            System.out.println(count++);
        }

        if (count < 5) {
            System.out.println(count++);
        } // count = 2

        if (count < 5) {
            System.out.println(count++);
        } // count = 3

        if (count < 5) {
            System.out.println(count++);
        } // count = 4

        if (count < 5) {
            System.out.println(count++);
        } // count = 5

        if (count < 5) {
            System.out.println(count++);
        } // count = 5

        System.out.printf("count = %d%n", count);


        int count2 = 0;

        while (count2 < 5) {
            System.out.println(count2);
            ++count2;
        }

        System.out.printf("count2 = %d", count2);
    }
}
