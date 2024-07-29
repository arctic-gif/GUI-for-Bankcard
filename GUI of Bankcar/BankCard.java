     
    
    
    /**
     * @author (Anmol Adhikari)
     * @version (1.1)
     */
    public class BankCard {
        
        //This section contains the data members of Bank Card
        private int cardId;
        private String clientName;
        private String issuerBank;
        private String bankAccount;
        private int balanceAmount;
        /**Bank Card Constructor**/
        public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank) {
            this.balanceAmount = balanceAmount;
            this.cardId = cardId;
            this.bankAccount = bankAccount;
            this.issuerBank = issuerBank;
            this.clientName = "";
        }
        //Accessor methods (Getter method)
        public int getCardId(){
            return cardId;
        }
        public String getClientName() {
            return clientName;
        }
    
        public String getIssuerBank() {
            return issuerBank;
        }
    
        public String getBankAccount() {
            return bankAccount;
        }
    
        public int getBalanceAmount() {
            return balanceAmount;
        }
        //Mutator methods (Setter method)
         public void setCardID(int cardId)
        {
            this.cardId =  cardId;
        }
        
        public void setClientName(String clientName)
        {
            this.clientName = clientName;
        }
        
        public void setIssuerBank(String issuerBank)
        {
            this.issuerBank = issuerBank;
        }
        
        public void setBankAccount(String bankAccount)
        {
            this.bankAccount =  bankAccount;
        }
        public void setBalanceAmount(int balanceAmount)
        {
            this.balanceAmount =  balanceAmount;
        }
        //The above method will display CardID, ClientName, IssuerBank, BankAccount and BalanceAmount.
        //This method displays the details entered.
        public void display() {
            if (clientName.isEmpty()) {
                //If clientName is empty then this message will be sent.
                System.out.println("Please Assign Client Name");
            } else {
                System.out.println("Card ID: " + cardId);
                System.out.println("Client name: " + clientName);
                System.out.println("Issuer bank: " + issuerBank);
                System.out.println("Bank account: " + bankAccount);
                System.out.println("Balance amount: " + balanceAmount);
            }
        }
    }
    
