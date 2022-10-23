package lessons.l8;
 /*
       Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
	 NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
  */
public class WhileExample5 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = mutlakDeger(kb.nextInt());

        if (val != 0)
            System.out.printf("%d sayisinin basamak sayisi: %d", val, countDigits(val));
        else
            System.out.println("Gecersiz deger (SIMDILIK)");
    }

    public static int countDigits(int val)
    {
        int count = 0;

        while (val > 0) {
            val /= 10;
            ++count;
        }

        return count;
    }

    public static int mutlakDeger(int x)
    {
        return x < 0 ? -x : x;
    }
}
