package lessons.l9;

public class Break {
    public static void main(String[] args)
    {
        boolean breakAllLoop = false;

        for (int i = 1; i < 10; ++i) {
            for (int j = 20; j >= 2; --j) {
                System.out.printf("(%d, %d)", i, j);

                if ((i + j) % 6 == 0) {
                    breakAllLoop = true;
                    break;
                }
            }
            if (breakAllLoop)
                break;
        }
    }
}
