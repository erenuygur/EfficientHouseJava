package lessons.flowcontrol.switchcase;

public class SwitchIntro {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Postal code: ");
        int postalCode = kb.nextInt();

        switch (postalCode) {
            case 55060:
                System.out.println("Samsun");
                break;
            case 35580:
                System.out.println("Izmir");
                break;
            case 25100:
                System.out.println("Erzurum");
                break;
            case 34212:
                System.out.println("Istanbul");
                break;
            case 42000:
                System.out.println("Konya");
                break;
            default:
                System.out.println("Invalid Postal code");
        }
    }
}


