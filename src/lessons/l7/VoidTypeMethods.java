package lessons.l7;

public class VoidTypeMethods {
    public static void main(String[] args)
    {
        isEven(10);
        isEven(11);
        isEven(-3);
    }

    public static void isEven(int val) {
        if (val < 0) {
            System.out.println("Illegal input: You can not enter negative value.");
            return;
        }

        if (val % 2 == 0)
            System.out.printf("%d is Even number%n", val);
        else
            System.out.printf("%d is not Even number%n", val);
    }
}
