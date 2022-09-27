package lessons.l3.string;

public class Immutable {
    public static void main(String[] args)
    {
        // Immutable Class (String)
        String isim = "Apple";
        String isim2 = "Apple";
        String isim3 = "Apple";

        if (isim == isim2) // Checks if they have same references (Memory address) on memory
            System.out.println("Same object");
        else
            System.out.println("Different object");

        if (isim == isim3)
            System.out.println("Same object");
        else
            System.out.println("Different object");

    }
}
