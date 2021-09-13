public class BankAccount{
    private double CheckingBalance;
    private double SavingsBalance;
    static double TotalAmountStored;
    static int NumOfAccounts;

    public BankAccount(double CheckingBalance, double SavingsBalance){
        this.CheckingBalance = CheckingBalance;
        this.SavingsBalance = SavingsBalance;
        NumOfAccounts += 1;
        TotalAmountStored += CheckingBalance;
        TotalAmountStored += SavingsBalance;
    }

    public double getCheckingBalance(){
        return CheckingBalance;
    }

    public double getSavingsBalance(){
        return SavingsBalance;
    }

    public void makeDeposit(double CheckingAmount, double SavingsAmount){
        if(CheckingAmount > 0){
            this.CheckingBalance += CheckingAmount;
            TotalAmountStored += CheckingAmount;
        }
        else if(SavingsAmount > 0){
            this.SavingsBalance += SavingsAmount;
            TotalAmountStored += SavingsAmount;
        }
        else{
            System.out.println("No money to Deposit at this time.");
        }
    }

    public void makeWithdrawal(double CheckingAmount, double SavingsAmount){
        if((CheckingAmount == 0) && (SavingsAmount == 0)){
            System.out.println("Amount must be greater than 0 to withdraw.");
            return;
        }
        if(CheckingAmount > this.CheckingBalance){
            System.out.println("Insufficient funds.");
            return;
        }
        else{
            this.CheckingBalance -= CheckingAmount;
            TotalAmountStored -= CheckingAmount;
            System.out.println("Total Withdrawal from Checking Account: " + CheckingAmount);
        }
        
        if(SavingsAmount > this.SavingsBalance){
            System.out.println("Insufficient funds.");
            return;
        }
        else{
            this.SavingsBalance -= SavingsAmount;
            TotalAmountStored -= SavingsAmount;
            System.out.println("Total Withdrawal from Savings Account: " + SavingsAmount);
        }
    }

    public void DisplayBalance(){
        double totalBalance = CheckingBalance + SavingsBalance;
        System.out.println("Your Current balance is: " + totalBalance);
        System.out.println("Your checkings accounts has: " + CheckingBalance + " and your Savings accounts has: " + SavingsBalance);
    }
}
