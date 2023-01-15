package lessons.flowcontrol.ifelse;

public class IfElseExample3 {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Username: ");
        String userName = keyboard.nextLine();

        // Username = "efficient" +    Password = "compareTo"

        if (userName.equals("efficient")) {

            System.out.print("Password: ");
            String password = keyboard.nextLine();

            if (password.equals("compareTo")) {
                System.out.println("Welcome to Efficient House");
            } else {
                System.out.println("Your password is wrong");
            }
        } else {
            System.out.println("There is no such user");
        }
    }
}
