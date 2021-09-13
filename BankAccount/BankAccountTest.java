public class BankAccountTest{
    public static void main(String[] args) {
        BankAccount AshAccount = new BankAccount(1500.00,20159.00);
        AshAccount.DisplayBalance();
        AshAccount.makeDeposit(100.00,0.00);
        AshAccount.DisplayBalance();
        AshAccount.makeWithdrawal(10.20,20.20);
        AshAccount.DisplayBalance();
    }
}