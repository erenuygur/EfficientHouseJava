package lessons.l10;

public class SwitchExample {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("alan kodu:");
        int alanKodu = kb.nextInt();

        switch (alanKodu) {
            case 216:
                System.out.println("Istanbul");
            case 212:
                System.out.println("Avrupa");
                break;
            case 242:
                System.out.println("Antalya");
                break;
        }
    }
}
