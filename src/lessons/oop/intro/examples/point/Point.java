package lessons.oop.intro.examples.point;

public class Point {
    public int x;
    public int y;

    public double distance(Point point)
    {
        return Math.sqrt((Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2)));
    }

    public static double distanceWithTwoPoint(Point p1, Point p2)
    {
        return p1.distance(p2);
    }
}

class PointFactory {
    public static Point createPoint(int x, int y)
    {
        Point p = new Point();

        p.x = x;
        p.y = y;

        return p;
    }

    public static Point createPoint(java.util.Scanner kb)
    {
        System.out.print("x:");
        int x = kb.nextInt();

        System.out.print("y:");
        int y = kb.nextInt();

        return createPoint(x, y);
    }

    public static Point createPoint(java.util.Random random)
    {
        System.out.print("x:");
        int x = random.nextInt(10);

        System.out.print("y:");
        int y = random.nextInt(10);

        return createPoint(x, y);
    }
}

class Test {
    public static void main(String[] args)
    {
        Point p1 = PointFactory.createPoint(new java.util.Scanner(System.in));
        Point p2 = PointFactory.createPoint(new java.util.Scanner(System.in));

        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(p1));

        System.out.println(Point.distanceWithTwoPoint(p1, p2));
        System.out.println(Point.distanceWithTwoPoint(p2, p2));

        Point p3 = PointFactory.createPoint(new java.util.Random());
        Point p4 = PointFactory.createPoint(new java.util.Random());

        System.out.println(p3.distance(p4));
        System.out.println(Point.distanceWithTwoPoint(p3, p4));
    }
}
