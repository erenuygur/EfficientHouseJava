package lessons.l9;

public class ForIntro {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Kac defa donmek istiyorsunuz");
        int n = kb.nextInt();

        int i = 0; // init

        while (i < n) { //boolean exp.
            System.out.println(i);
            //...

            ++i;
        }

        System.out.println("------------------------");

        /*
            for döngü deyiminin genel biçimi:
	            for ([1.kısım]; [2.kısım]; [3.kısım])
	 	            <deyim>

                1.kısım: Akış for döngü deyimine geldiğinde BIR KEZ yapılacak kısımdır
                2.kısım: for döngü deyiminin koşul ifadesine ilişkin kısımdır. Buraya yazılacak ifadenin boolean türden olması gerekir.
	            Bu ifade true olduğu sürece döngü yinelenir. Akış for döngü deyimine geldiğinde 1.kısım yapıldıktan sonra kontrol
	            yapılır
	            3.kısım: Döngünün bir adımı tamamlandığında bir sonraki adıma geçmek için yapılacak kontrolden hemen önce yapılır
         */

        for (int i2 = 0; i2 < 5; i2++) { // n kez donuyo
            System.out.println(i2);
        }
    }
}
