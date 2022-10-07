import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);

        System.out.println("Type in your Tip Percentage.");
        int tipPercentage = input.nextInt();

        System.out.println("Type in your the amount of people in your party.");
        int totalpeople = input.nextInt();

        TipCalculator wow = new TipCalculator(totalpeople, tipPercentage);

        System.out.println("Welocome user type in your bill.");
        double totalBill = input.nextDouble();
        wow.addMeal(totalBill);


        double totaltip = wow.tipAmount();
        double totalCost1 = wow.totalBill();
        double billPerPerson = wow.perPersonCostBeforeTip();
        double tipPerPerson =  wow.perPersonTipAmount();
        double totalPerPerson = wow.totalBill();

        System.out.println("Total tip = " + totaltip);
        System.out.println("Total cost including tip = " + totalCost1);
        System.out.println("Total tip for a person = " + tipPerPerson);
        System.out.println("Total cost not including tip for a person = " +  billPerPerson);
        System.out.println("Total cost including tip for a person = " +  totalPerPerson);
        System.out.println("Thank you for using");

    }
}
