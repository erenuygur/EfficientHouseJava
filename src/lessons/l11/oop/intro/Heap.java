package lessons.l11.oop.intro;

public class Heap {
    public static void main(String[] args)
    {
        Human eren; // reference
        eren = new Human();

        System.out.println(eren.age); // 0
        System.out.println(eren.height); // 0
        System.out.println(eren.weight); // 0

        eren.age = 23;
        eren.height = 1.82f;
        eren.weight = 100.5f;

        System.out.println(eren.age); // 23
        System.out.println(eren.height); // 1.82
        System.out.println(eren.weight); // 100.5
    }
}

class Human {
    public int age;
    public float height;
    public float weight;
}