package lessons.l8;

/*
       Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
	 NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
  */

public class DoWhileExample {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = kb.nextInt();

        System.out.printf("%d sayisinin basamak sayisi: %d", val, countDigits(val));
    }

    public static int countDigits(int val)
    {
        int count = 0;

        do {
            val /= 10;
            ++count;
        } while (val > 0);

        return count;
    }
}
