package lessons.l3.string;

public class Immutable {
    public static void main(String[] args)
    {
        // Immutable (Degismez) Class
        String isim = "Eren";
        String isim2 = "Eren";
        String isim3 = "Eren";

        if (isim == isim2) // Ayni nesnenin referansini tutup tutmatigina bakar
            System.out.println("Ayni");
        else
            System.out.println("Farkli");

        if (isim == isim3)
            System.out.println("Ayni");
        else
            System.out.println("Farkli");

    }
}
