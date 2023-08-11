package lessons.oop.basics;

public class StackExample {
    public static void main(String[] args)
    {
        foo(6, 7);
        // int x = 6; x created in Stack // long y = 7; y created in Stack
        // First s then y then x pop from Stack

        {
            int a; // created in Stack
            double d; // created in Stack
        } //// First d then a pop from Stack


        byte b; // created in Stack
        short s; // created in Stack

        {
            float f; // created in Stack
            {
                boolean bool; // created in Stack
            } // bool pop from Stack
        } // f pop from Stack
    } // First s then b pop from Stack


    public static void foo(int x, long y)
    {
        short s;
    }
}
