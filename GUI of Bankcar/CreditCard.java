 


/**
 * Write a description of class CreditCard here.
 *
 * @author (Anmol Adhikari)
 * @version (1.1)
 */
public class CreditCard extends BankCard {
    //This section contains the data members of credit card
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate) {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        isGranted = false;
    }
    // Accessor methods for each attribute (Getter Method)
    public int getCvcNumber() {
        return cvcNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public boolean getIsGranted() {
        return isGranted;
    }
    //Setter Method for setting Credit limit.
    public void setCreditLimit(double newCreditLimit, int newGracePeriod) {
        if (newCreditLimit <= (getBalanceAmount() * 2.5)) {
            creditLimit = newCreditLimit;
            gracePeriod = newGracePeriod;
            isGranted = true;
        } else {
            System.out.println("Credit cannot be issued");
        }
    }
    // Method to cancel credit card
    public void cancelCreditCard() {
        if (isGranted) {
            cvcNumber = 0;
            creditLimit = 0;
            gracePeriod = 0;
            isGranted = false;
            System.out.println("Credit card has been cancelled");
        }
    }
    // Display method to show details of CreditCard
    public void display() {
        super.display();
        if (isGranted) {
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod);
        } else {
            System.out.println("Credit has not been granted yet");
        }
    }
}