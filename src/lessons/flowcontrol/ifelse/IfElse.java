package lessons.flowcontrol.ifelse;

public class IfElse {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Yasin age: ");
        int yasinAge = keyboard.nextInt(); // 21

        System.out.print("Akif age: ");
        int akifAge = keyboard.nextInt(); // 29

        System.out.print("Eren age: ");
        int erenAge = keyboard.nextInt(); //17

        // Let's go to the bar

        if (yasinAge >= 18)
            System.out.println("Yasin can enter the bar");
        else
            System.out.println("Yasin cant enter the bar");

        if (akifAge >= 18) {
            System.out.println("Akif can enter the bar");
        }
        else {
            System.out.println("Akif cant enter the bar");
        }

        if (erenAge >= 18) {
            System.out.println("Eren can enter the bar");
        } else {
            System.out.println("Eren cant enter the bar");
        }
    }
}
