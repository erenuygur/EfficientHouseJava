package lessons.flowcontrol.ifelse;

public class IfElseExample4 {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Username: ");
        String userName = keyboard.nextLine();

        if (userName.charAt(2) == 's') {

            System.out.print("Password: ");
            String password = keyboard.nextLine();

            if (password.charAt(password.length() - 3) == 'x') {
                System.out.println("Welcome to Efficient House");
            } else {
                System.out.println("Your password is wrong");
            }
        } else {
            System.out.println("There is no such user");
        }
    }
}
