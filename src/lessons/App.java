package lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args)
    {

//        String text = "Hello  hello";
//
//        String[] strArray = text.split(" ");
//        System.out.println(strArray);
//
//        for (String str : strArray)
//            System.out.printf("[%s]%n", str);
//
//        System.out.println("-------------------------------------");
//
//        strArray = text.split(" +");
//
//        for (String str : strArray)
//            System.out.printf("[%s]%n", str);

        List<String> list = getTokens("one (1), two (2), three (3)", "[a-z]+|[()0-9]+");

        for (String str : list)
            System.out.println(str);
    }

    private static List<String> getTokens(String text, String pattern)
    {
        ArrayList<String> tokens = new ArrayList<String>();
        Pattern tokSplitter = Pattern.compile(pattern);
        Matcher m = tokSplitter.matcher(text);

        while (m.find()) {
            tokens.add(m.group());
        }

        return tokens;
    }
}
