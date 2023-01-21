package lessons.oop.intro.nonstatics;

public class Example3 {
    public int x;

    public static void changeX(Example3 example3, int a)
    {
        example3.changeXWithNonstatic(a);
    }

    public void changeXWithNonstatic(int a)
    {
        x = a;
    }
}
