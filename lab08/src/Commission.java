public class Commission extends Hourly{
    private double totalSales=0;
    private double comRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double CommissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        comRate=CommissionRate;
    }
    public void addSales (double totalSales){
        this.totalSales+=totalSales;
    }

    @Override
    public double pay() {
        double payment=super.pay()+totalSales*comRate;
        totalSales=0;
        return payment;
    }

    @Override
    public void addHours(int moreHours) {
        super.addHours(moreHours);
    }

    @Override
    public String toString() {
        return super.toString()+" \nTotal Sales: "+totalSales;
    }

}
