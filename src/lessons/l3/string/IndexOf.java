package lessons.l3.string;

public class IndexOf {
    public static void main(String[] args)
    {
        String s = "Ben cok iyi bir Java programcisi olmak istiyorum. Java -Shirtless";

        char ch = 'J';
        int index = s.indexOf(ch);
        System.out.printf("%c'nin Indexi:%d%n", ch ,index);

        char chr = 'f';
        int index2 = s.indexOf(chr); //eger aradigimiz karakter bulunamazsa bize -1 degerini doner
        System.out.printf("%c'nin Indexi:%d%n", chr ,index2);

        String s2 = "Java";
        int index3 = s.indexOf(s2);
        System.out.printf("%s'nin Indexi:%d%n", s2, index3);

        int index4 = s.indexOf(s2, 17);
        System.out.println(index4);

        int index5 = s.lastIndexOf(s2);
        System.out.println(index5);

        String s3 = "Java programcisi";
        int index6 = s.indexOf(s3);
        System.out.println(index6);
    }
}
