package lessons.l8;

/*
        Parametresi ile aldığı int türden bir sayının basamakları toplamını döndüren sumDigits isimli
	 metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz. Metot negatif sayılar için basamakları
	 toplamını pozitif olarak döndürecektir
 */
public class WhileExample6 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = kb.nextInt();

        System.out.printf("%d basamaklari toplami = %d%n", val, sumDigits(val));
    }

    public static int sumDigits(int val)
    {   // 1123
        int sum = 0;

        while (val > 0) {
            sum += val % 10; // 3 + 2 + 1 + 1 = 7
            val /= 10;       // 112 11 1 0
        }

        return sum;
    }
}
