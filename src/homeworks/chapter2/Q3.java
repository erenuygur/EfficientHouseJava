package homeworks.chapter2;
/*
Write a program that starts with the string variable first set to your first name
and the string variable last set to your last name. Both names should be all lowercase. Your program should then create a new string that contains your full name in
pig latin with the first letter capitalized for the first and last name. Use only the pig
latin rule of moving the first letter to the end of the word and adding “ay.” Output
the pig latin name to the screen. Use the substring and toUpperCase methods
to construct the new name.

For example, given

 first = "walt";
 last = "savitch";

the program should create a new string with the text “Altway Avitchsay” and print it.
*/
public class Q3 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("First name:");
        String first =kb.nextLine();

        System.out.print("Last name:");
        String last = kb.nextLine();

        String pigLatinFirst = first.substring(1, 2).toUpperCase() + first.substring(2) + first.substring(0, 1) + "ay";
        String pigLatinLast = last.substring(1, 2).toUpperCase() + last.substring(2) + last.substring(0, 1) + "ay";
        System.out.println(pigLatinFirst + " " + pigLatinLast);
    }
}
