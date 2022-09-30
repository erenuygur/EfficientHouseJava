package homeworks.chapter1;

public class Q3 {
    public static void main(String[] args) {
        String first = "walt";
        String last = "savitch";

        String pigLatinFirst = first.substring(1, 2).toUpperCase() + first.substring(2) + first.substring(0, 1) + "ay";
        String pigLatinLast = last.substring(1, 2).toUpperCase() + last.substring(2) + last.substring(0, 1) + "ay";
        System.out.println(pigLatinFirst + " " + pigLatinLast);
    }
}
