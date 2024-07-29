 


/**
 * Write a description of class DebitCard here.
 *
 * @author (Anmol Adhikari)
 * @version (1.1)
 */
public class DebitCard extends BankCard {
    //This section contains the data members of Debit Card
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    /**Debit card Constructor**/
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
     // Accessor methods for each attribute (Getter method)
    public int getPinNumber() {
        return pinNumber;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return hasWithdrawn;
    }
    // Mutator method for withdrawalAmount attribute (Setter method)
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
    // Withdraw method to deduct money from client account
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int enteredPin) {
        ////If the pin number that is entered by the user matches the pin number that is set, they can withdraw the money
        if (enteredPin == pinNumber) {
            ////If the withdrawal amount given by user is less than or equal to Balance Amount then the money is deducted from the BalanceAmount
            if (getBalanceAmount() >  withdrawalAmount) {
                setBalanceAmount(getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                hasWithdrawn = true;
                System.out.println("Withdrawal successful. New balance: " + getBalanceAmount());
            } 
            else {
                System.out.println("Your balance is insufficient, please check your account balance and try again.");
            }
        } else {
            System.out.println("Incorrect pin entered.");
        }
    }
    // Display method to show details of DebitCard
    public void display() {
        super.display();
        if (hasWithdrawn) {
            System.out.println("Pin number: " + pinNumber);
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " + dateOfWithdrawal);
        }
        else
        {
            System.out.println("No withdrawal has been made yet");
        }
    }
}