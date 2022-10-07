public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercentage)
    {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    double getTotalBillBeforeTip()
    {
        return totalBillBeforeTip;
    }

    double getTipPercentage()
    {
        return tipPercentage;
    }

    double addMeal(double cost)
    {
        totalBillBeforeTip += cost;
        return totalBillBeforeTip;
    }

    double tipAmount()
    {
        double totalTipAmount = tipPercentage * totalBillBeforeTip * 0.01;
        return totalTipAmount;
    }

    double totalBill()
    {
        //double totalTipAmount = 0;
        double totalCost = tipAmount() + totalBillBeforeTip;
        return totalCost;
    }

    double perPersonCostBeforeTip()
    {
        double totalCosBeforetPerPerson = getTotalBillBeforeTip()/numPeople;
        return totalCosBeforetPerPerson;
    }

    double perPersonTipAmount()
    {
        double totalTipAmountPerPerson = tipAmount() / numPeople;
        return totalTipAmountPerPerson;
    }

    double perPersonTotalCost()
    {
        double totalPerPerson = perPersonTipAmount() + perPersonCostBeforeTip();
        return totalPerPerson;
    }




}

