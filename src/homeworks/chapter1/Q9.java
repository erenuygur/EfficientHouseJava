package homeworks.chapter1;

public class Q9 {
    public static void main(String[] args)
    {
        int minimumWeight = 110;
        int heightFt = 6;
        int heightInch = heightFt * 12;
        int bodyWeight = minimumWeight + (heightInch % 60) * 5;

        System.out.printf("Height = %d(ft) = Ideal Body Weight: %d(pound)", heightFt, bodyWeight);
    }
}
