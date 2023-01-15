package lessons.consolio.stringintro;

public class StringClass {
    public static void main(String[] args)
    {
        //Concatenation
        String firstName = "John";
        String lastName = "Matt";
        int age = 23;
        double height = 1.84;
        System.out.println("First name: " + firstName + " Last name: " + lastName + " Age: " + age + " Height: " + height);

        System.out.println("99" + 1 + 1); // 9911
        System.out.println(999 + "1" + 2); // 99912
        System.out.println(999 + 1 + "999"); // 1000999

        System.out.println("--------------");

        int a = 11;
        System.out.println(a++); // 11
        //  public void println(int x) | int x = a++;
        // int x = a;
        // a = a + 1;
        System.out.println(a); // 12
    }
}
