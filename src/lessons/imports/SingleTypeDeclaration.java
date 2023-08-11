package lessons.imports;

import java.util.Random;

public class SingleTypeDeclaration {
    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        Random r = new Random();

        System.out.println("Number:");
        int n = Integer.parseInt(kb.nextLine());


        for (int i = 0; i < n; ++i)
            System.out.printf("%d.random number: %d%n", i, r.nextInt(100));

        Scanner s = new Scanner();
    }
}

class Scanner {
    // ...
}
