package lessons.l7;

public class Method6 {
    public static void main(String[] args)
    {
        isEven(10);
        isEven(11);
        isEven(-3);
    }

    public static void isEven(int val) {
        if (val < 0) {
            System.out.println("Abi hatali girdin ben geri donuyom (ama bir sey getirmiyorum :))");
            return;
        }

        if (val % 2 == 0)
            System.out.printf("%d is Even number%n", val);
        else
            System.out.printf("%d is not Even number%n", val);
    }
}
