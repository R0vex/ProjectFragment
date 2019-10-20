package sk.itsovy.ladislavracz.ProjectFragment;

public class Bank {
    String Bank;

    public Bank(String bank) {
        Bank = bank;
    }
    public double convert ( double amount, String code)
    {
        double HUF= 330.52;
        double GBP= 1.16;
        double TRY= 6.46;
        double CHF= 0.91;
        double HRK= 0.13;
        switch (code){
            case "HUF":{
                return HUF*amount;
            }
            case "TRY":{
                return TRY*amount;
            }
            case "CHF":{
                return CHF*amount;
            }
            case "HRK":{
                return HRK*amount;
            }
            case "GBP":{
                return GBP*amount;
            }
        }
        return -1;
    }
    public static double loan (double value, double interest, int months) {
        double myInterest=(value/100)*interest;
        return (value+myInterest)/months;
    }
}
