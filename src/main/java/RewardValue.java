public class RewardValue{
    private double cash;
    private double miles;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = cashToMiles(cash);
    }
    private double cashToMiles(double cash){
        return cash / 0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return miles;
    }
}