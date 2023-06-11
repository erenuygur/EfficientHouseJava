package lessons.imports;

import static lessons.imports.test.Math.add;
import static lessons.imports.test.Math.subst;
import static lessons.imports.test.Math.multiply;
import static lessons.imports.test.Math.divide;
import static java.lang.Math.*;
import static java.lang.System.*;

public class SingleTypeStaticImport {
    public static void run()
    {
        System.out.println(add(5, 3));
        System.out.println(subst(10, 5));
        System.out.println(multiply(6, 9));
        System.out.println(divide(10, 3));

        abs(-5);

        out.println("Efficient House - Static import examples");
    }
}
