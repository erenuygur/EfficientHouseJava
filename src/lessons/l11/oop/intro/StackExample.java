package lessons.l11.oop.intro;

public class StackExample {
    public static void main(String[] args)
    {
        foo(6, 7);
        // int x = 6; Stack'te x yaratildi // long y = 7; Stack'te y yaratildi (Parametre degiskenleri sirasi ile Stack'te yaratildi)
        // Once s sonra y sonra x stackten yok edilir

        {
            int a; // Stack'te yaratildi
            double d; // Stack'te yaratildi
        } // Once d sonra a stackten yok edilir


        byte b; // Stack'te yaratildi
        short s; // Stack'te yaratildi

        {
            float f; // Stack'te yaratildi
            {
                boolean bool; // Stack'te yaratildi
            } // bool stackten yok edilir
        } // f stackten yok edilir
    } // Once s sonra b stackten yok edilir


    public static void foo(int x, long y)
    {
        short s;
    }
}
