package lessons.loops;

public class LabeledBreak {
    public static void main(String[] args)
    {
        EXIT_LOOP:
        for (int i = 1; i < 10; ++i)
            for (int j = 20; j >= 2; --j) {
                System.out.printf("(%d, %d)", i, j);

                if ((i + j) % 6 == 0)
                    break EXIT_LOOP;
            }

        complexLabeledBreak();
    }

    public static void complexLabeledBreak()
    {
        EXIT_LOOP:
        for (int i = 6; i < 100; i += 2)
            EXIT_INNER_LOOP:
            for (int j = 3; j < 87; j++)
                for (int k = 20; k >= 0; --k) {
                    System.out.printf("(%d, %d, %d)%n", i, j, k);

                    if ((i + j + k) % 13 == 0)
                        break;

                    if ((i + j + k) % 7 == 0)
                        break EXIT_INNER_LOOP;

                    if ((i + j + k) % 5 == 0)
                        break EXIT_LOOP;
                }

        System.out.println("EFFICIENT HOUSE");
    }
}
