package homeworks.chapter1;

public class Q2 {
    public static void main(String[] args)
    {
        for (int i = 0; i < 1000; ++i) {
            System.out.printf("Coupon = %d || ", i);
            couponStore(i);
            System.out.println("---------------------------------------");
        }

    }

    public static void couponStore(int coupons)
    {
        int candyCost = 10;
        int gumballCost = 3;
        int candy;
        int gumball;

        if (coupons % candyCost == 0) {
            System.out.printf("%d = %d Candy%n", coupons, coupons / candyCost);
            return;
        }

        if (coupons % gumballCost == 0) {
            System.out.printf("Gumball = %d || Coupon remaining: %d%n", coupons / gumballCost, coupons % gumballCost);
            return;
        }

        candy = coupons / candyCost;
        System.out.printf("Candy: %d || ", candy);
        coupons %= candyCost;

        gumball = coupons / gumballCost;
        System.out.printf("Gumball = %d || ", gumball);
        coupons %= gumballCost;

        System.out.printf("Coupon remaining: %d%n", coupons);


        if (candy >= 1 && coupons == 2) {
            --candy;
            gumball += 4;
            coupons -= 2;

            System.out.println("============ OR ============");
            System.out.printf("Candy: %d || Gumball = %d || Coupon remaining: %d%n", candy, gumball, coupons);
            return;
        }

        if (candy >= 2 && coupons == 1) {
            candy -= 2;
            gumball += 7;
            --coupons;
            System.out.println("============ OR ============");
            System.out.printf("Candy: %d || Gumball = %d || Coupon remaining: %d%n", candy, gumball, coupons);
        }
    }
}
