package lessons.methods.methodoverloading;

import java.util.Random;

public class Example1 {
    public static void main(String[] args)
    {
        java.util.Random random = new Random();

        AnimalFactory animalFactory = new AnimalFactory();

        Human human = animalFactory.createHuman(random, "Numan");
        Dog dog = animalFactory.createDog(random, "Findik");
        Cat cat = animalFactory.createCat(random, "Duman");

        DefineAndDisplay.displayProperties(human);
        DefineAndDisplay.makeNoise(human);

        DefineAndDisplay.displayProperties(dog);
        DefineAndDisplay.makeNoise(dog);

        DefineAndDisplay.displayProperties(cat);
        DefineAndDisplay.makeNoise(cat);
    }
}

class AnimalFactory {

    public Human createHuman(java.util.Random random, String name)
    {
        Human human = new Human();

        human.name = name;
        human.height = random.nextInt(50) + 150;

        return human;
    }

    public Dog createDog(java.util.Random random, String name)
    {
        Dog dog = new Dog();

        dog.name = name;
        dog.age = random.nextInt(13) + 1;

        return dog;
    }

    public Cat createCat(java.util.Random random, String name)
    {
        Cat cat = new Cat();

        cat.name = name;
        cat.isEyesColored = random.nextBoolean();

        return cat;
    }
}

class DefineAndDisplay {

    public static void makeNoise(Human human)
    {
        System.out.println(human.makeNoise());
    }

    public static void makeNoise(Dog dog)
    {
        System.out.println(dog.makeNoise());
    }

    public static void makeNoise(Cat cat)
    {
        System.out.println(cat.makeNoise());
    }

    public static void displayProperties(Human human)
    {
        System.out.println(human.name);
    }

    public static void displayProperties(Dog dog)
    {
        System.out.println(dog.name);
    }

    public static void displayProperties(Cat cat)
    {
        System.out.println(cat.name);
    }
}

class Human {
    public String name;
    public int height;

    public String makeNoise()
    {
        return "Hello";
    }
}

class Dog {
    public String name;
    public int age;

    public String makeNoise()
    {
        return "woof";
    }
}

class Cat {
    public String name;
    public boolean isEyesColored;

    public String makeNoise()
    {
        return "meow";
    }
}