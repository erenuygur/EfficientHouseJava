package lessons.oop.intro.statics;

public class GameApp {
    public static void main(String[] args)
    {
        WarGameApp.run();
    }
}

class WarGameApp {
    public static void run()
    {
        for (int i = 0; i < 10; ++i) {
            Warrior warrior = new Warrior();

            //..
            Worker worker = new Worker();
            worker.countIncrease();
        }

        //...

        for (int i = 0; i < 20; ++i) {
            Worker worker = new Worker();

            //..

            worker.countIncrease();
        }

        System.out.printf("Number of warrior: %d%n", Warrior.count);
        System.out.printf("Number of worker: %d%n", Worker.count);
    }
}

class Warrior {
    public static int count;

    public int power;
    public int numberOfGuns;

    public void countIncrease()
    {
        count++;
    }
}

class Worker {
    public static int count;

    public int energy;

    public void countIncrease()
    {
        count++;
    }
}

class Animal {
    //...
}



