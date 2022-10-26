package homeworks.extra.hw1;

public class Q4 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int index = 0;

        while (index++ <= 999999)
            if (isArmstrong(index))
                System.out.printf("%d is Armstrong .%n", index);
    }

    public static boolean isArmstrong(int a) {
        return a == getDigitsPowSum(a) && a > 0;
    }

    public static int getDigitsPowSum(int a) { // --
        int digits = countDigits(a);
        int result = 0;

        while (a != 0) {
            result += pow(a % 10, digits);
            a /= 10;
        }

        return result;
    }

    public static int pow(int a, int b) {
        int result = 1;

        while (b-- > 0) {
            result *= a;
        }

        return result;
    }

    public static int countDigits(int a) {
        int count = 0;

        do {
            count++;
            a /= 10;
        } while (a != 0);

        return count;
    }
}

