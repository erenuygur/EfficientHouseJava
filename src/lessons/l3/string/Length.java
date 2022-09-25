package lessons.l3.string;

public class Length {
    public static void main(String[] args)
    {
        String str = "Merhabalar benim adim Eren, 23 yasindayim Kocaeli Universitesi ....";
        int length = str.length(); //Yazinin karakter sayisini bize dondurur.

        // printf (format karakterini alan printf metot'u)
        // %s = String || %d = decimal types || %f = floating types || %b = boolean || %c = char
        System.out.printf("%s Yazisinin uzunlugu = %d dir%n", str, length);
        System.out.println(str + " Yazisinin uzunlugu = " + length + " dir");


        System.out.printf("Bu karisimin derisimi %% %d oranindadir%n", 99);
        System.out.printf("PI SAYISI = %.2f%n", Math.PI);

        int day = 5;
        int month = 9;
        int year = 2022;
        System.out.printf("Bugunun tarihi: %05d / %03d / %d%n", day, month, year);
    }
}
