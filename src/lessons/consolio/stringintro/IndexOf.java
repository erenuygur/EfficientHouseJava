package lessons.consolio.stringintro;

public class IndexOf {
    public static void main(String[] args)
    {
        String s = "I want to be a very good Java programmer";

        char ch = 'J';
        int index = s.indexOf(ch);
        System.out.printf("%c Index:%d%n", ch ,index);

        char chr = 'f';
        int index2 = s.indexOf(chr); // -1 if the character does not occur before that point.
        System.out.printf("%c Index:%d%n", chr ,index2);

        String s2 = "Java";
        int index3 = s.indexOf(s2);
        System.out.printf("%s Index:%d%n", s2, index3);

        int index4 = s.indexOf(s2, 17);
        System.out.println(index4);

        int index5 = s.lastIndexOf(s2);
        System.out.println(index5);

        String s3 = "Java programmer";
        int index6 = s.indexOf(s3);
        System.out.println(index6);
    }
}
