package lessons.l3.string;

public class UpperLower {
    public static void main(String[] args)
    {
        String s = "bes";
        String s2 = s.toUpperCase(); //Harfleri buyultuyor

        // String sinifi immutable class oldugundan degisiklik yapilamaz, nesneyi alip (nesnenin ustunde degil)
        // degisiklik yaparak bize yeni bir nesne dondurur.

        if (s == s2)
            System.out.println("Ayni nesne");
        else
            System.out.println("Farkli nesne");

        System.out.println(s);
        System.out.println(s2);


        String s3 = "BES";
        String s4 = s3.toLowerCase(); //Harfleri kucultur

        System.out.println(s4);

        if (s == s4)
            System.out.println("Ayni");
        else
            System.out.println("Farkli");
    }
}
