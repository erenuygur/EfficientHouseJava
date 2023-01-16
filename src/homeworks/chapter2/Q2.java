package homeworks.chapter2;

/*
The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.
*/

public class Q2 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Coupon count:");
        int couponCount = Integer.parseInt(kb.nextLine());

        couponStore(couponCount);
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
