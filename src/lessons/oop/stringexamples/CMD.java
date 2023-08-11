package lessons.oop.stringexamples;

class CMD {
    static String cmd = "C:\\Users\\EREN\\Desktop\\Java";
    static java.util.Scanner kb = new java.util.Scanner(System.in);

    public static void run()
    {
        for (;;) {
            System.out.print(cmd + ":");

            String input = kb.nextLine();

            if (input.equals("exit"))
                break;



            if (input.startsWith("cd")) {
                if (input.startsWith("cd ..")) {
                    int index = cmd.lastIndexOf("\\");
                    cdToUpper(cmd.substring(0, index));
                } else
                    cd(input.substring(3));
            }

            if (input.equals("date"))
                date();
        }
    }

    public static void date()
    {
        System.out.println("4/13/2023");
    }

    public static void cd(String path)
    {
        cmd += "\\" + path;
    }

    public static void cdToUpper(String path)
    {
        cmd = path;
    }
}