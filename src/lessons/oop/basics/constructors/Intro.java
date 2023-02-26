package lessons.oop.basics.constructors;

public class Intro {
    public static void main(String[] args)
    {
        Phone phone1;
        phone1 = new Phone(120, 60);

        System.out.println(phone1.height);
        System.out.println(phone1.width);

        System.out.println("-----------------------");

        Phone phone2 = new Phone();

        System.out.println(phone2.height);
        System.out.println(phone2.width);

        System.out.println("-----------------------");

        Cup cup1 = new Cup(100, "Red", true);
        Cup cup2 = new Cup(150, "Black", false);

        Cup cup3 = new Cup();
        cup3.volume = 250;
        cup3.color = "Orange";
        cup3.hasSticker = true;
    }
}

class Phone {
    public int height;
    public int width;

    Phone(int newHeight, int newWidth) {
        height = newHeight;
        width = newWidth;
    }

    Phone()
    {}
}

class Cup {
    public double volume;
    public String color;
    public boolean hasSticker;

    public Cup(double newVolume, String newColor, boolean newHasSticker)
    {
        volume = newVolume;
        color = newColor;
        hasSticker = newHasSticker;

        System.out.println("Instance is ready - CTOR");
    }

    public Cup()
    {
    }
}