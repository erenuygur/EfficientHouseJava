package lessons.imports;

import static lessons.imports.test.Math.*;

public class StaticImport {
    public static void run()
    {
        System.out.println(add(5, 3));
        System.out.println(subst(10, 5));
        System.out.println(multiply(6, 9));
        System.out.println(divide(10, 3));
    }
}
