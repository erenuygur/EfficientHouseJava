package homeworks.chapter1;

public class Q4 {
    public static void main(String[] args)
    {
        final double artificialSweetener = 0.001;
        double mouseWeight = .3;
        double killMouse = mouseWeight * 0.1;
        double sodaCountForMouse = killMouse / artificialSweetener;

        System.out.println(sodaCountForMouse);

        double humanWeight = 20;
        double sodaCountForHuman = humanWeight / mouseWeight * sodaCountForMouse;

        System.out.println(sodaCountForHuman);

        /* Solution 2
        // Constant variables related to Mouse (Assuming, variables in kg)
        double amountSweetenerToKillMouse = 0.0000013;
        final double weightOfMouse = 0.03;

        // Constant variables related to Dieter (Assuming, variables in kg)
        double startingWeightDieter = 110.0;
        double desiredWeightDieter = 85.0;


        // Calculating the proportionate fatal amount of soda
        double sodaForSafeUse = ((amountSweetenerToKillMouse / weightOfMouse) * desiredWeightDieter) / 0.001;

        // Printing result to the screen
        System.out.println("To lose " + (startingWeightDieter - desiredWeightDieter) + " kilograms.");
        System.out.println("Safe soda limit to have: " + sodaForSafeUse);
         */
    }
}
