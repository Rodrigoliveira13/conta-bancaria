package entities;

public class Account {
    private  int numberAccount;
    private String name;
    private double iniDeposit;
    private double sald;
    private static double TAXA = 5.00;


    public Account(int numberAccount, String name, double iniDeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.iniDeposit = iniDeposit;

    }

    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }
    public int getNumberAccount(){
        return this.numberAccount;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getIniDeposit(){
        return this.iniDeposit;
    }
    public void setIniDeposit(double iniDeposit){
        this.iniDeposit = iniDeposit;
    }

    public double getSald() {
        return sald + iniDeposit;
    }
    public void setSald(double sald){
        this.sald = sald;
    }

    public void deposit(double value){
        sald += value;
    }
    public void saque(double value){
        this.sald = sald - value - TAXA;
    }

    @Override
    public String toString() {
        return "Account " +
                numberAccount + ", " +
                "Holder: " + name + ", "+
                "Balance: $ " + getSald();
    }
}
