package lessons.l3.string;

public class Equals {
    public static void main(String[] args)
    {
        String s = "Efficient House"; // Onbellege alinir
        String s2 = new String("Efficient House"); // Yeni nesne yaratmak yerine onbellekte olan nesneyi kullanir

        if (s == s2)
            System.out.println("Bu referanslar ayni nesnenin adresini tutuyor");
        else
            System.out.println("Bu referanslar ayni nesnenin adresini tutmuyor");

        if (s.equals(s2))
            System.out.println("Bunlar tam olarak ayni karakterleri tutuyor");
        else
            System.out.println("Bunlar ayni karakterleri tutmuyor");


        String str = "EFFICIENT HOUSE";
        String str2 = "EffIciENt HouSE";


        if (str.equalsIgnoreCase(str2))
            System.out.println("Bunlar buyukluk kuculukluk haric ayni karakterleri tutuyor");
        else
            System.out.println("Bunlar buyukluk kuculukluk haric ayni karakterleri tutmuyor");

    }
}
