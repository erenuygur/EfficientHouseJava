package lessons.arrays;

import java.util.Random;
import java.util.Scanner;

public class Assign {
    public static void assignExample()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("keys count: ");
        int n = Integer.parseInt(kb.nextLine());

        boolean[] keys = new boolean[n];

        for (int i = 0; i <= keys.length -1; ++i) {
            keys[i] = r.nextBoolean();
        }

        System.out.println("Which doors is open ?");

        for (int i = 0; i < keys.length; ++i) {
            if (keys[i])
                System.out.printf("%d. door is open :)%n", i);
            else
                System.out.printf("%d. door is not open :(%n", i);
        }
    }
}


class Class {
    Student [] students;
}

class Student {

}