package homeworks.chapter3;

public class Q2 {
    public static void main(String[] args)
    {
        display();
    }

    public static String rgb()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        String result = "";
        String colorCharHolder = "";

        for (int i = 1; i <= 5; i++) {

            System.out.printf("Please enter the %d. color : ", i);
            String colorChar = kb.nextLine().substring(0,1);

            if (!"RGB".contains(colorChar)) {
                return "You have entered invalid color.";
            }

            if(colorCharHolder.equals(colorChar)) {
                return "You have entered the same color consecutively : " + colorCharHolder + colorChar;
            }

            colorCharHolder = colorChar;
            result += colorChar;
        }

        return result;
    }

    public static void display()
    {
        System.out.printf("Your color combination is : %s.",rgb());
    }
}
