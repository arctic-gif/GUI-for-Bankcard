
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.border.*;
public class BankGUI
{  
    //Selection screen GUI components.
    JFrame frame;
    JPanel panel;
    JButton creditCardm, debitCardm;
    JLabel pic, title, payment;

    //Credit Card GUI components.
    JLabel cvcNumber, creditLimit, cinterestRate, gracePeriod, ccreditCard, cexpirationDate, cardId, clientName, 
    issuerBank, bankAccount, balanceAmount ;
    JTextField cvcNumberTextField,creditLimitTextField, interestRateTextField, gracePeriodTextField, cardIdTextField, clientNameTextField, 
    issuerBankTextField, bankAccountTextField, balanceAmountTextField;
    JFrame cframe;
    JPanel cpanel;
    JComboBox eday, emonth, eyear;
    JButton cadd, cdisplay, ctd, cclear, cancelCreditCard, setCreditLimit;

    //Debit Card GUI components.
    JPanel dpanel;
    JFrame dframe;
    JLabel dclientNameLabel, dissuerBankLabel, dbankAccountLabel, dbalanceAmountLabel, dpinNumberLabel,
    dwithdrawalAmountLabel, ddebitCard, dwithdrawalDateLabel,dcardIdLabel;
    JComboBox wday, wmonth, wyear;
    JButton dadd, ddisplay, withdraw, dclear, dtc;
    JTextField dcardIdTextField, dclientNameTextField, dissuerBankTextField, dbankAccountTextField,
    dbalanceAmountTextField, dpinNumberTextField, dwithdrawalAmountTextField;
    //Array For BankCard

    ArrayList<BankCard> bankCardarr = new ArrayList<BankCard>();

    //Main GUI for choosing between Debit Card and Credit Card
    BankGUI()
    {
        frame=new JFrame("Main Gui");
        panel=new JPanel();
        panel.setBackground(Color.MAGENTA);
        frame.add(panel);

        panel.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(0,0,0), 8), BorderFactory.createLineBorder(new Color(100,100,100),8)));
        Border border = BorderFactory.createLineBorder(new Color(0,0,0), 2);

        title=new JLabel("Welcome to our banking system");
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        title.setBounds(122,39,500,42);
        panel.add(title);

        payment=new JLabel("Choosing a payment system");
        payment.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        payment.setBounds(171,126,358,34);
        panel.add(payment);

        creditCardm= new JButton("Credit Card");
        creditCardm.setBounds(88,289,120,32);
        panel.add(creditCardm);
        creditCardm.setBackground(Color.CYAN);
        creditCardm.setForeground(Color.BLACK);
        creditCardm.setBorder(border);

        debitCardm=new JButton("Debit Card");
        debitCardm.setBounds(508,289,120,32);
        panel.add(debitCardm);
        debitCardm.setBackground(Color.CYAN);
        debitCardm.setForeground(Color.BLACK);
        debitCardm.setBorder(border);

        //Adds Action Listener to creditCardm button
        creditCardm.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent creditcard)
                {
                    CreditCardGUI();//Opens the credit card GUI
                    frame.dispose();//Disposes the Main GUI frame
                }
            });
        
        creditCardm.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    creditCardm.setBackground(Color.BLACK);
                    creditCardm.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    creditCardm.setBackground(Color.CYAN);
                    creditCardm.setForeground(Color.BLACK);
                }
            });

        debitCardm.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent debitcard)
                {
                    DebitCardGUI();//Opens the debit card GUI
                    frame.dispose();//Disposes the Main GUI frame
                }
            });

        debitCardm.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    debitCardm.setBackground(Color.BLACK);
                    debitCardm.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    debitCardm.setBackground(Color.CYAN);
                    debitCardm.setForeground(Color.BLACK);
                }
            });

        panel.setLayout(null);
        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }

    public void CreditCardGUI()
    {
        cframe = new JFrame();
        cpanel = new JPanel();
        cpanel.setBackground(Color.MAGENTA);
        cframe.add(cpanel);

        ccreditCard = new JLabel("Credit Card");
        ccreditCard.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ccreditCard.setBounds(453,8,122,34);
        cpanel.add(ccreditCard);

        Border border = BorderFactory.createLineBorder(new Color(0,0,0), 2);

        cardId = new JLabel("Card ID:");
        cpanel.add(cardId);
        cardId.setBounds(101,97,53,20);
        cardIdTextField = new JTextField();
        cardIdTextField.setBounds(182,91,180,32);
        cpanel.add(cardIdTextField);
        cardIdTextField.setBorder(border);

        cvcNumber = new JLabel("CVC Number:");
        cpanel.add(cvcNumber);
        cvcNumber.setBounds(631,99,88,20);
        cvcNumberTextField = new JTextField();
        cvcNumberTextField.setBounds(741,91,180,32);
        cpanel.add(cvcNumberTextField);
        cvcNumberTextField.setBorder(border);

        balanceAmount = new JLabel("Balance Amount:");
        cpanel.add(balanceAmount);
        balanceAmount.setBounds(45,179,107,20);
        balanceAmountTextField = new JTextField();
        balanceAmountTextField.setBounds(182,173,180,32);
        cpanel.add(balanceAmountTextField);
        balanceAmountTextField.setBorder(border);

        issuerBank = new JLabel("Issuer Bank:");
        cpanel.add(issuerBank);
        issuerBank.setBounds(635,179,79,20);
        issuerBankTextField = new JTextField();
        issuerBankTextField.setBounds(741,173,180,32);
        cpanel.add(issuerBankTextField);
        issuerBankTextField.setBorder(border);

        bankAccount = new JLabel("Bank Account:");
        cpanel.add(bankAccount);
        bankAccount.setBounds(63,261,91,20);
        bankAccountTextField = new JTextField();
        bankAccountTextField.setBounds(182,255, 180,32);
        cpanel.add(bankAccountTextField);
        bankAccountTextField.setBorder(border);

        clientName = new JLabel("Client Name:");   
        cpanel.add(clientName);
        clientName.setBounds(637,259,82,20);
        clientNameTextField = new JTextField();
        clientNameTextField.setBounds(745,255,180,32);
        cpanel.add(clientNameTextField);
        clientNameTextField.setBorder(border);

        cinterestRate = new JLabel("Interest Rate:");
        cpanel.add(cinterestRate);
        cinterestRate.setBounds(68,441,86,20);
        interestRateTextField = new JTextField();
        interestRateTextField.setBounds(188,435,180,32);
        cpanel.add(interestRateTextField);
        interestRateTextField.setBorder(border);

        gracePeriod= new JLabel("Grace Period:");
        cpanel.add(gracePeriod);
        gracePeriod.setBounds(637,441,89,20);
        gracePeriodTextField = new JTextField();
        gracePeriodTextField.setBounds(751,435,180,32);
        cpanel.add(gracePeriodTextField);
        gracePeriodTextField.setBorder(border);

        creditLimit = new JLabel("Credit Limit:");
        cpanel.add(creditLimit);
        creditLimit.setBounds(78,530,76,20);
        creditLimitTextField = new JTextField();
        creditLimitTextField.setBounds(188,524,180,32);
        cpanel.add(creditLimitTextField);
        creditLimitTextField.setBorder(border);

        String Cday[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String Cmonth[] = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        String Cyear[] = {"2023","2024","2025","2026","2027","2028"};
        cexpirationDate = new JLabel("Expiration Date:");
        cexpirationDate.setBounds(635,536,102,20);
        eday=new JComboBox<String>(Cday);
        eday.setBounds(751,536,50,20);
        emonth=new JComboBox<String>(Cmonth);
        emonth.setBounds(804,536,100,20);
        eyear=new JComboBox<String>(Cyear);
        eyear.setBounds(907,536,70,20);
        cpanel.add(cexpirationDate);
        cpanel.add(eday);
        cpanel.add(emonth);
        cpanel.add(eyear);

        cclear = new JButton("Clear");
        cclear.setBounds(248,687,120,32);
        cpanel.add(cclear);
        cclear.setBackground(Color.CYAN);
        cclear.setForeground(Color.BLACK);
        cclear.setBorder(border);

        cclear.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    cclear.setBackground(Color.BLACK);
                    cclear.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    cclear.setBackground(Color.CYAN);
                    cclear.setForeground(Color.BLACK);
                }
            });

        cancelCreditCard = new JButton("Cancel Credit");
        cancelCreditCard.setBounds(801,613,120,32);
        cpanel.add(cancelCreditCard);
        cancelCreditCard.setBackground(Color.CYAN);
        cancelCreditCard.setForeground(Color.BLACK);
        cancelCreditCard.setBorder(border);

        cancelCreditCard.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    cancelCreditCard.setBackground(Color.BLACK);
                    cancelCreditCard.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    cancelCreditCard.setBackground(Color.CYAN);
                    cancelCreditCard.setForeground(Color.BLACK);
                }
            });

        setCreditLimit = new JButton("Set Credit Limit");
        setCreditLimit.setBounds(101,613,125,30);
        cpanel.add(setCreditLimit);
        setCreditLimit.setBackground(Color.CYAN);
        setCreditLimit.setForeground(Color.BLACK);
        setCreditLimit.setBorder(border);

        setCreditLimit.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    setCreditLimit.setBackground(Color.BLACK);
                    setCreditLimit.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    setCreditLimit.setBackground(Color.CYAN);
                    setCreditLimit.setForeground(Color.BLACK);
                }
            });

        cadd = new JButton("Add Credit");
        cadd.setBounds(637,337,120,32);
        cpanel.add(cadd);
        cadd.setBackground(Color.CYAN);
        cadd.setForeground(Color.BLACK);
        cadd.setBorder(border);

        cadd.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    cadd.setBackground(Color.BLACK);
                    cadd.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    cadd.setBackground(Color.CYAN);
                    cadd.setForeground(Color.BLACK);
                }
            });

        cdisplay = new JButton("Display");
        cdisplay.setBounds(242,337,120,32);
        cpanel.add(cdisplay);
        cdisplay.setBackground(Color.CYAN);
        cdisplay.setForeground(Color.BLACK);
        cdisplay.setBorder(border);

        cdisplay.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    cdisplay.setBackground(Color.BLACK);
                    cdisplay.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    cdisplay.setBackground(Color.CYAN);
                    cdisplay.setForeground(Color.BLACK);
                }
            });

        ctd = new JButton("Change to Debit Card");
        ctd.setBounds(649,687,160,32);
        cpanel.add(ctd);
        ctd.setBackground(Color.CYAN);
        ctd.setForeground(Color.BLACK);
        ctd.setBorder(border);

        ctd.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    ctd.setBackground(Color.BLACK);
                    ctd.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    ctd.setBackground(Color.CYAN);
                    ctd.setForeground(Color.BLACK);
                }
            });

        ctd.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent changetodebitcard) 
                {
                    DebitCardGUI();//Opens the debit card GUI
                    cframe.dispose();//Disposes the credit card frame
                }
            });

        // set up action listener for Clear button
        cclear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent clearinputcredit)
                {
                    // clear out all Credit Card input fields
                    cardIdTextField.setText(""); //Clears the Credit card card ID text field
                    cvcNumberTextField.setText(""); //Clears the Credit card cvc number text field
                    balanceAmountTextField.setText(""); //Clears the Credit card balance amount text field
                    issuerBankTextField.setText(""); //Clears the Credit issuer bank ID text field
                    bankAccountTextField.setText(""); //Clears the Credit card bank account text field
                    clientNameTextField.setText(""); //Clears the Credit card client name text field
                    interestRateTextField.setText(""); //Clears the Credit card interest rate text field
                    gracePeriodTextField.setText(""); //Clears the Credit card grace period text field
                    creditLimitTextField.setText(""); //Clears the Credit card credit limit text field

                    // show success message
                    JOptionPane.showMessageDialog(cframe, "The Credit Card inputs have been cleared out");
                }
            });

        setCreditLimit.addActionListener(new ActionListener(){
                // This is the actionPerformed method which gets called when the button is clicked
                public void actionPerformed(ActionEvent setcreditlimit){

                    // This if block checks if the bankCardarr list is empty, if so, it shows an error message
                    if(bankCardarr.isEmpty()){
                        JOptionPane.showMessageDialog(cframe,"No Credit Card Entries Found!", "Null Values Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        // This else block checks if the required fields are filled, if not, it shows an error message
                        if(gracePeriodTextField.getText().isEmpty() ||creditLimitTextField.getText().isEmpty() ||  cardIdTextField.getText().isEmpty()){
                            JOptionPane.showMessageDialog(cframe, "Please fill the required boxes to set Credit Limit", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            try{
                                // This block of code gets the new credit limit and grace period from the text fields and sets them as double and integer respectively
                                double newCreditLimit = Double.parseDouble(creditLimitTextField.getText());
                                int newGracePeriod = Integer.parseInt(gracePeriodTextField.getText());

                                // This block of code loops through the bankCardarr list to find the credit card with the given card id
                                for(BankCard setcredlimit: bankCardarr){
                                    if(setcredlimit instanceof CreditCard){
                                        CreditCard creditCard = (CreditCard) setcredlimit;

                                        // This if block checks if the new credit limit and grace period are greater than 0
                                        if(newCreditLimit > 0 && newGracePeriod > 0){

                                            // This if block checks if the card id matches with the credit card's card id
                                            if(Integer.parseInt(cardIdTextField.getText()) == creditCard.getCardId()){
                                                // This block of code sets the credit limit and grace period for the credit card
                                                creditCard.setCreditLimit(newCreditLimit, newGracePeriod);

                                                // This if block checks if the credit limit has been granted successfully, if so, it shows a success message
                                                if(creditCard.getIsGranted() == true){
                                                    JOptionPane.showMessageDialog(cframe, "You have limited your credit succesfully, Credit Limit" +"\n"+
                                                        "Credit Limit: "+ newCreditLimit +"\n"+ "Grace Period: "+ newGracePeriod, "Credit Limit Set",JOptionPane.INFORMATION_MESSAGE);
                                                }
                                                // This else block shows an error message if the credit limit has not been granted successfully
                                                else{
                                                    JOptionPane.showMessageDialog(cframe, "Your balance is less than your credit limit, please try setting up credit limit again", "Error setting up credit limit", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }
                                            // This else block shows an error message if the card id entered is wrong
                                            else{
                                                JOptionPane.showMessageDialog(cframe, "You have entered wrong Card ID!", "Credit Limit", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        // This else block shows an error message if the new credit limit or grace period is 0
                                        else{
                                            JOptionPane.showMessageDialog(cframe, "A value of 0 cannot be entered in credit limit or grace field!", "Error setting up credit limit", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    // This else block shows an error message if the credit card is not an instance of Bank Card
                                    else{
                                        JOptionPane.showMessageDialog(cframe, "Credit Card is not instance of Bank Card!", "Error setting up credit limit", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                            // This catch block shows an error message if invalid values are entered
                            catch(NumberFormatException scl){
                                JOptionPane.showMessageDialog(cframe, "You have entered invalid values" , "Error setting up credit limit", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });

        cancelCreditCard.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent cancelcred) {
                    // Check if the "bankCardarr" is empty or not.
                    if (bankCardarr.isEmpty()) {
                        JOptionPane.showMessageDialog(cframe, "No Credit Card Entries Found!", "Null Entries", JOptionPane.ERROR_MESSAGE);
                    } 
                    else {
                        // Check if the "cardIdTextField" is empty or not.
                        if (cardIdTextField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(cframe, "You must enter Card ID to cancel Credit!", "Empty Card ID field", JOptionPane.ERROR_MESSAGE);
                        } 
                        else {
                            try {
                                boolean existingCard = false;
                                // Loop through the "bankCardarr" array and check if there is a "CreditCard" instance that matches the "cardIdTextField" input.
                                for (BankCard cancel : bankCardarr) {
                                    if (cancel instanceof CreditCard) {
                                        CreditCard creditCard = (CreditCard) cancel;
                                        if (creditCard.getCardId() == Integer.parseInt(cardIdTextField.getText())){
                                            // Check if the credit limit has been set or not.
                                            if (creditCard.getCreditLimit() == 0){
                                                JOptionPane.showMessageDialog(cframe, "You have not set the credit limit yet", "Credit limit has not been set", JOptionPane.ERROR_MESSAGE);
                                            }
                                            else{
                                                // Cancel the credit card and show a success message.
                                                creditCard.cancelCreditCard();
                                                JOptionPane.showMessageDialog(cframe, "You have successfuly cancelled your credit card", "Credit Cancelled", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            existingCard = true;
                                            break;
                                        }
                                    }
                                }
                                // If the "existingCard" flag is still false, show an error message.
                                if (existingCard == false) {
                                    JOptionPane.showMessageDialog(cframe, "Your card ID does not match, please enter a correct Card ID!", "Card ID error", JOptionPane.ERROR_MESSAGE);
                                }
                            } 
                            catch (NumberFormatException ccl) {
                                JOptionPane.showMessageDialog(cframe, "Please enter a valid number!", "Cancel error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });

        cadd.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent addcred)
                {
                    // Check if any required fields are empty
                    if(cardIdTextField.getText().isEmpty() || balanceAmountTextField.getText().isEmpty() || bankAccountTextField.getText().isEmpty() || clientNameTextField.getText().isEmpty() || issuerBankTextField.getText().isEmpty() || interestRateTextField.getText().isEmpty() || cvcNumberTextField.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(cframe,"Required Fields are empty!", "Empty Field", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        try{
                            // Check for negative values in text fields
                            if(Integer.parseInt(cvcNumberTextField.getText())<=0 || Integer.parseInt(cardIdTextField.getText())<=0 ||  Integer.parseInt(balanceAmountTextField.getText())<=0 || Double.parseDouble(interestRateTextField.getText())<=0){
                                JOptionPane.showMessageDialog(cframe, "You may not enter negative value in the text fields!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                            // Check if bank account has numbers
                            else if(bankAccountTextField.getText().matches(".*\\d.*")) {
                                JOptionPane.showMessageDialog(cframe,"Bank account cannot have numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                            // Check if issuer bank has numbers
                            else if(issuerBankTextField.getText().matches(".*\\d.*")) {
                                JOptionPane.showMessageDialog(cframe,"Issuer bank cannot have numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                            // Check if client name has numbers
                            else if(clientNameTextField.getText().matches(".*\\d.*")) {
                                JOptionPane.showMessageDialog(cframe,"Client name cannot have numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                            else{
                                // Parse the values from the text fields
                                int balanceAmount = Integer.parseInt(balanceAmountTextField.getText());
                                String bankAccount = bankAccountTextField.getText();
                                String issuerBank = issuerBankTextField.getText();
                                int cardId = Integer.parseInt(cardIdTextField.getText());
                                String clientName = clientNameTextField.getText();
                                int cvcNumber = Integer.parseInt(cvcNumberTextField.getText());
                                double interestRate = Double.parseDouble(interestRateTextField.getText());
                                String day = (String) eday.getSelectedItem();
                                String month = (String) emonth.getSelectedItem();
                                String year = (String) eyear.getSelectedItem();
                                String expirationDate = day + "/" + month + "/" + year;

                                // Check if the entered card ID already exists
                                boolean exists = false;
                                for (BankCard add: bankCardarr) {
                                    if (add instanceof CreditCard) {
                                        CreditCard creditCard = (CreditCard) add;
                                        if(creditCard.getCardId() == cardId) {
                                            exists = true;
                                            break;
                                        }
                                    }
                                }

                                if (exists == true) {
                                    // Display an error message if the card ID already exists
                                    JOptionPane.showMessageDialog(cframe, "The Card ID you have entered already exists!", "CARD ID error", JOptionPane.ERROR_MESSAGE);
                                } 
                                else{
                                    // Create a new credit card object and add it to the bank card array
                                    CreditCard objcc = new CreditCard(cardId,issuerBank,bankAccount,clientName,balanceAmount,cvcNumber,interestRate,expirationDate);
                                    bankCardarr.add(objcc);
                                    JOptionPane.showMessageDialog(cframe, "The entered values have been stored", "Values Stored", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                        catch(NumberFormatException addcc){
                            // Display an error message if the user enters non-integer values in integer fields
                            JOptionPane.showMessageDialog(cframe, "You may not enter alphabets in text fields which require integers!", "Wrong Input", JOptionPane.ERROR_MESSAGE); 
                        }
                    }
                }
            });

        // This code sets up an ActionListener for displaying input values
        cdisplay.addActionListener(new ActionListener()
            {
                // actionPerformed method called when button is clicked
                public void actionPerformed(ActionEvent cdisplay)
                {
                    // Check if bankCardarr is empty
                    if(bankCardarr.isEmpty())
                    {
                        JOptionPane.showMessageDialog(cframe,"No Credit Card Credentials  Entered", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        // Iterate through bankCardarr to display credit card details
                        for(BankCard display : bankCardarr)
                        {
                            // Check if the bank card is an instance of CreditCard
                            if (display instanceof CreditCard)
                            {
                                CreditCard creditCard = (CreditCard) display;
                                // Display Credit Card details
                                System.out.println("------------------------------------------------");
                                System.out.println("Card ID:" +creditCard.getCardId());
                                System.out.println("CVCNumber:" +creditCard.getCvcNumber());
                                System.out.println("Interest Rate:"+creditCard.getInterestRate());
                                System.out.println("Client Name:" +creditCard.getClientName());
                                System.out.println("Issuer Bank:" +creditCard.getIssuerBank());
                                System.out.println("Bank Account:" +creditCard.getBankAccount());
                                System.out.println("Balance Amount:" +creditCard.getBalanceAmount());
                                System.out.println("Expiry Date:" +creditCard.getExpirationDate());
                                System.out.println("Credit Limit:" +creditCard.getCreditLimit());
                                System.out.println("Grace Period:" +creditCard.getGracePeriod());
                                System.out.println("------------------------------------------------");
                            }
                        }
                    }
                }
            });

        cpanel.setLayout(null);
        cframe.setResizable(false);
        cframe.setVisible(true);
        cframe.setSize(1000,800);
        cframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cframe.setLocationRelativeTo(null);
    }

    public void DebitCardGUI()
    {

        dframe= new JFrame();
        dpanel= new JPanel();
        dpanel.setBackground(Color.MAGENTA);
        ddebitCard = new JLabel("Debit Card");
        ddebitCard.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ddebitCard.setBounds(463,2,114,34);
        dpanel.add(ddebitCard);
        Border border = BorderFactory.createLineBorder(new Color(0,0,0), 2);

        dcardIdLabel = new JLabel("Card ID:");
        dpanel.add(dcardIdLabel);
        dcardIdLabel.setBounds(111,97,53,20);
        dcardIdTextField = new JTextField();
        dcardIdTextField.setBounds(192,91,180,32);
        dpanel.add(dcardIdTextField);
        dcardIdTextField.setBorder(border);

        dclientNameLabel = new JLabel("Client Name:");   
        dpanel.add(dclientNameLabel);
        dclientNameLabel.setBounds(640,305,82,20);
        dclientNameTextField = new JTextField();
        dclientNameTextField.setBounds(755,299,180,32);
        dpanel.add(dclientNameTextField);
        dclientNameTextField.setBorder(border);

        dbalanceAmountLabel = new JLabel("Balance Amount:");
        dpanel.add(dbalanceAmountLabel);
        dbalanceAmountLabel.setBounds(55,199,107,20);
        dbalanceAmountTextField = new JTextField();
        dbalanceAmountTextField.setBounds(192,193,180,32);
        dpanel.add(dbalanceAmountTextField);
        dbalanceAmountTextField.setBorder(border);

        dissuerBankLabel = new JLabel("Issuer Bank:");
        dpanel.add(dissuerBankLabel);
        dissuerBankLabel.setBounds(640,201,79,20);
        dissuerBankTextField = new JTextField();
        dissuerBankTextField.setBounds(751,195,180,32);
        dpanel.add(dissuerBankTextField);
        dissuerBankTextField.setBorder(border);

        dbankAccountLabel = new JLabel("Bank Account:");
        dpanel.add(dbankAccountLabel);
        dbankAccountLabel.setBounds(71,315,91,20);
        dbankAccountTextField = new JTextField();
        dbankAccountTextField.setBounds(192,309,180,32);
        dpanel.add(dbankAccountTextField);
        dbankAccountTextField.setBorder(border);

        dpinNumberLabel = new JLabel("PIN Number:");
        dpanel.add(dpinNumberLabel);
        dpinNumberLabel.setBounds(637,97,82,20);
        dpinNumberTextField = new JTextField();
        dpinNumberTextField.setBounds(751,91,180,32);
        dpanel.add(dpinNumberTextField);
        dpinNumberTextField.setBorder(border);

        dwithdrawalAmountLabel = new JLabel("Withdrawal Amount:");
        dpanel.add(dwithdrawalAmountLabel);
        dwithdrawalAmountLabel.setBounds(38,530,126,20);
        dwithdrawalAmountTextField = new JTextField();
        dwithdrawalAmountTextField.setBounds(198,524,180,32);
        dpanel.add(dwithdrawalAmountTextField);
        dwithdrawalAmountTextField.setBorder(border);

        String dday[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String dmonth[] = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        String dyear[] = {"2023","2024","2025","2026","2027","2028"};
        dwithdrawalDateLabel = new JLabel("Withdrawal Date:");
        dpanel.add(dwithdrawalDateLabel);
        dwithdrawalDateLabel.setBounds(635,533,110,20);
        wday =  new JComboBox<String>(dday);
        wday.setBounds(755,533,50,20);
        wmonth = new JComboBox<String>(dmonth);
        wmonth.setBounds(808,533,100,20);
        wyear = new JComboBox<String>(dyear);
        wyear.setBounds(911,533,70,20);
        dpanel.add(wday);
        dpanel.add(wmonth);
        dpanel.add(wyear);

        dclear = new JButton("Clear");
        dclear.setBounds(252,655,120,32);
        dpanel.add(dclear);
        dclear.setBackground(Color.CYAN);
        dclear.setForeground(Color.BLACK);
        dclear.setBorder(border);

        dclear.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    dclear.setBackground(Color.BLACK);
                    dclear.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    dclear.setBackground(Color.CYAN);
                    dclear.setForeground(Color.BLACK);
                }
            });

        dadd = new JButton("Add");
        dadd.setBounds(662,425,120,32);
        dpanel.add(dadd);
        dadd.setBackground(Color.CYAN);
        dadd.setForeground(Color.BLACK);
        dadd.setBorder(border);

        dadd.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    dadd.setBackground(Color.BLACK);
                    dadd.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    dadd.setBackground(Color.CYAN);
                    dadd.setForeground(Color.BLACK);
                }
            });

        ddisplay= new JButton("Display");
        ddisplay.setBounds(252,425,120,32);
        dpanel.add(ddisplay);
        ddisplay.setBackground(Color.CYAN);
        ddisplay.setForeground(Color.BLACK);
        ddisplay.setBorder(border);

        ddisplay.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    ddisplay.setBackground(Color.BLACK);
                    ddisplay.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    ddisplay.setBackground(Color.CYAN);
                    ddisplay.setForeground(Color.BLACK);
                }
            });

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(449,592,120,32);
        dpanel.add(withdraw);
        withdraw.setBackground(Color.CYAN);
        withdraw.setForeground(Color.BLACK);
        withdraw.setBorder(border);

        withdraw.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    withdraw.setBackground(Color.BLACK);
                    withdraw.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    withdraw.setBackground(Color.CYAN);
                    withdraw.setForeground(Color.BLACK);
                }
            });

        dtc = new JButton("Change to Credit Card");
        dtc.setBounds(662,655,166,32);
        dpanel.add(dtc);
        dtc.setBackground(Color.CYAN);
        dtc.setForeground(Color.BLACK);
        dtc.setBorder(border);

        dtc.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent hover) {
                    dtc.setBackground(Color.BLACK);
                    dtc.setForeground(Color.WHITE);
                }

                public void mouseExited(MouseEvent hover) {
                    dtc.setBackground(Color.CYAN);
                    dtc.setForeground(Color.BLACK);
                }
            });

        // Adds an ActionListener to the ctc button
        dtc.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent switchtocreditcard) 
                {
                    CreditCardGUI(); //Opens the credit card GUI
                    dframe.dispose(); //Disposes the debit card frame
                }
            });

        dclear.addActionListener(new ActionListener()
            {
                // Defines what should happen when the button is pressed
                public void actionPerformed(ActionEvent clearinputdebit)
                {
                    dcardIdTextField.setText(""); // Clears the Debit Card ID text field
                    dclientNameTextField.setText(""); // Clears the Debit Card client name text field
                    dbalanceAmountTextField.setText(""); // Clears the Debit Card balance amount text field
                    dissuerBankTextField.setText(""); // Clears the Debit Card issuer bank text field
                    dbankAccountTextField.setText(""); // Clears the Debit Card bank account text field
                    dwithdrawalAmountTextField.setText(""); // Clears the Debit Card withdrawal amount text field
                    dpinNumberTextField.setText(""); // Clears the Debit Card PIN number text field
                    JOptionPane.showMessageDialog(dframe, "The Debit Card inputs have been cleared out"); // Displays a message dialog indicating that the fields have been cleared
                }
            });

        dadd.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent adddebit)
                {
                    // Checks if any of the required fields are empty
                    if(dbalanceAmountTextField.getText().isEmpty() || dbankAccountTextField.getText().isEmpty() || dissuerBankTextField.getText().isEmpty() || dcardIdTextField.getText().isEmpty() || 
                    dclientNameTextField.getText().isEmpty() || dpinNumberTextField.getText().isEmpty())
                    {
                        // Shows an error message if any of the required fields are empty
                        JOptionPane.showMessageDialog(dframe,"Required Fields are empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        try{
                            // Checks if any of the fields requiring integers contain negative values
                            if(Integer.parseInt(dcardIdTextField.getText())<0 || Integer.parseInt(dbalanceAmountTextField.getText())<0 || Integer.parseInt(dpinNumberTextField.getText())<0){
                                // Shows an error message if any of the fields requiring integers contain negative values
                                JOptionPane.showMessageDialog(dframe,"You may not enter negative value in the text fields!", "Card ID Error", JOptionPane.ERROR_MESSAGE);
                            }
                            // Checks if the bank account field contains numbers
                            else if(dbankAccountTextField.getText().matches(".*\\d.*")) {
                                // Shows an error message if the bank account field contains numbers
                                JOptionPane.showMessageDialog(dframe,"Numbers cannot be entered in Bank Account field!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                            // Checks if the client name field contains numbers
                            else if(dclientNameTextField.getText().matches(".*\\d.*")) {
                                // Shows an error message if the client name field contains numbers
                                JOptionPane.showMessageDialog(dframe,"Numbers cannot be enterred in Client Name field!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                            // Checks if the issuer bank field contains numbers
                            else if(dissuerBankTextField.getText().matches(".*\\d.*")) {
                                // Shows an error message if the issuer bank field contains numbers
                                JOptionPane.showMessageDialog(dframe,"Numbers cannot be entered in bank cannot Field!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            }
                            else{
                                // If all the validation checks pass, create a new DebitCard object
                                int balanceAmount = Integer.parseInt(dbalanceAmountTextField.getText());
                                String bankAccount = dbankAccountTextField.getText();
                                String issuerBank = dissuerBankTextField.getText();
                                int cardId = Integer.parseInt(dcardIdTextField.getText());
                                String clientName = dclientNameTextField.getText();
                                int pinNumber = Integer.parseInt(dpinNumberTextField.getText());

                                // Checks if a card with the same card ID already exists
                                boolean cardExists = false;
                                for (BankCard add: bankCardarr) {
                                    if (add instanceof DebitCard) {
                                        DebitCard debitCard = (DebitCard) add;
                                        if(debitCard.getCardId() == cardId) {
                                            cardExists = true;
                                            break;
                                        }
                                    }
                                }
                                if (cardExists == true) {
                                    // Shows an error message if a card with the same card ID already exists
                                    JOptionPane.showMessageDialog(dframe, "The Card ID you have entered already exists!", "Card ID Error", JOptionPane.ERROR_MESSAGE);
                                } 
                                else{
                                    // Creates a new debit card object and adds it to the bank card array
                                    DebitCard objdc = new DebitCard(balanceAmount,cardId,bankAccount,issuerBank,clientName,pinNumber);
                                    bankCardarr.add(objdc);
                                    // Shows a success message
                                    JOptionPane.showMessageDialog(dframe, "The values have been stored", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                        catch(NumberFormatException adc){
                            JOptionPane.showMessageDialog(dframe, "You may not enter alphabets in text fields which require integers!", "Error", JOptionPane.ERROR_MESSAGE); 
                        }
                    } 
                }
            });

        // Adding action listener to the withdraw button
        withdraw.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent dwith) {
                    // Setting boolean variable to true for validation
                    boolean wdc= true;
                    // Checking if the required fields are empty
                    if(dcardIdTextField.getText().isEmpty() || dpinNumberTextField.getText().isEmpty() || dwithdrawalAmountTextField.getText().isEmpty() ){
                        // Showing error message if the required fields are empty
                        JOptionPane.showMessageDialog(dframe, "Required Field Must be filled!", "Empty Field", JOptionPane.ERROR_MESSAGE); 
                        // Setting boolean variable to false to prevent further execution
                        wdc=false;
                    }
                    else{
                        // Checking if the withdrawal amount or pin number is less than zero
                        if(Integer.parseInt(dwithdrawalAmountTextField.getText())<0 || Integer.parseInt(dpinNumberTextField.getText())<0){
                            // Showing error message if the withdrawal amount or pin number is less than zero
                            JOptionPane.showMessageDialog(dframe,"You cannot give values less than zero", "Card ID Error", JOptionPane.ERROR_MESSAGE);
                        }
                        // Checking if the validation is successful
                        if(wdc)
                        {
                            try{
                                // Parsing integer values from the text fields
                                int cardId = Integer.parseInt(dcardIdTextField.getText());
                                int pinNumber = Integer.parseInt(dpinNumberTextField.getText());
                                int withdrawalAmount = Integer.parseInt(dwithdrawalAmountTextField.getText());
                                // Getting client name from the text field
                                String clientName = dclientNameTextField.getText();
                                // Getting the selected date from the combo box
                                String day = (String) wday.getSelectedItem();
                                String month = (String) wmonth.getSelectedItem();
                                String year = (String) wyear.getSelectedItem();
                                String dateOfWithdrawal = day + "/" + month + "/" + year;
                                boolean confir=true;
                                // Looping through the bank card array
                                for (BankCard withdraw : bankCardarr) 
                                {
                                    if (withdraw instanceof DebitCard)
                                    { 
                                        // Getting the balance amount, card ID, bank account and issuer bank for the debit card
                                        int balanceAmount = withdraw.getBalanceAmount();
                                        int CardId = withdraw.getCardId();
                                        String bankAccount = withdraw.getBankAccount();
                                        String issuerBank = withdraw.getIssuerBank();
                                        // Checking if the entered card ID matches the existing card ID
                                        if (cardId == CardId) 
                                        { 
                                            confir=true;
                                            // Creating a debit card object for withdrawal
                                            DebitCard debit = (DebitCard) withdraw;
                                            // Withdrawing the amount from the debit card object
                                            debit.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber);
                                            // Checking if the withdrawal amount is greater than the balance amount
                                            if (withdrawalAmount > balanceAmount) {
                                                // Showing error message if the withdrawal amount is greater than the balance amount
                                                JOptionPane.showMessageDialog(dframe, "Insufficient balance amount to withdraw", "Withdrawal Error", JOptionPane.ERROR_MESSAGE);
                                            } else {
                                                // Showing success message if the withdrawal is successful
                                                JOptionPane.showMessageDialog(dframe, "Withdrawn amount: " +withdrawalAmount + "\n" + "Date of withdrawal: " +dateOfWithdrawal + "\n" + "Pin Number:" + pinNumber ,"Withdraw successful" ,JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("invalid details");
                                        }
                                    }
                                } 
                            }
                            catch(NumberFormatException dcw)
                            {
                                // Setting the text field to empty if the ID entered is not valid
                                dcardIdTextField.setText("");
                                JOptionPane.showMessageDialog(dframe,"The ID you have entered is not valid","ID Error",JOptionPane.ERROR_MESSAGE);

                            }
                            catch(NullPointerException ddcw)
                            {
                                JOptionPane.showMessageDialog(dframe,"The required fields must be filled","Unfilled values" ,JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });

        // Add an action listener to the display button
        ddisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent debdisplay)
                {
                    // Check if the bankCardarr is empty
                    if(bankCardarr.isEmpty())
                    {
                        // Display error message if the bankCardarr is empty
                        JOptionPane.showMessageDialog(dframe,"No Debit Card Credentials Entered", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        // Iterate over the bankCardarr to display the Debit card details
                        for(BankCard ddisplay : bankCardarr)
                        {
                            // Check if the card is a Debit card
                            if (ddisplay instanceof DebitCard)
                            {
                                DebitCard debitCard = (DebitCard) ddisplay;
                                System.out.println("------------------------------------------------");
                                System.out.println("Card ID:" +debitCard.getCardId());
                                System.out.println("Client Name:" +debitCard.getClientName());  
                                System.out.println("Issuer Bank:" +debitCard.getIssuerBank());
                                System.out.println("Bank Account:" +debitCard.getBankAccount());
                                System.out.println("PIN number:" +debitCard.getPinNumber());
                                System.out.println("Balance Amount:" +debitCard.getBalanceAmount());
                                System.out.println("------------------------------------------------");
                            }
                        }
                    }
                }
            });

        dpanel.setLayout(null);
        dframe.add(dpanel);
        dframe.setResizable(false);
        dframe.setVisible(true);
        dframe.setSize(1000,800);
        dframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dframe.setLocationRelativeTo(null);
    }

    public static void main(String args[])
    {
        new BankGUI();
    }
}
