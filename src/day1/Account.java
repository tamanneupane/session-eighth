package day1;

import java.math.BigDecimal;

public class Account {

    // States

    // account number (String)

     private String accountNumber;

    // account holder name (String)

    private String accountHolderName;

    // account type (Enum)

    private AccountType accountType;

    // account balance (Float)

    private BigDecimal accountBalance;

    // bank name (String)

    private final String bankName = "RBB";

    // branch (String)
    private String branch;

    // social security number (String)
    private String ssn;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSsn(String ssn) {
        // Encryption encryptedSSN
        this.ssn = ssn;
    }

    // Behaviour

    // create account
    // delete account
    // withdraw
    public void withdraw(){
        accountBalance = BigDecimal.valueOf(5000);
    }
    // balance transfer
    public void transferBalance(Account from, Account to, BigDecimal balanceToBeTransferred){
//        from.setAccountBalance(from.getAccountBalance() - balanceToBeTransferred);
        from.setAccountBalance(from.getAccountBalance().subtract(balanceToBeTransferred));
//        to.setAccountBalance(to.getAccountBalance() + balanceToBeTransferred);
        to.setAccountBalance(to.getAccountBalance().add(balanceToBeTransferred));

        System.out.println("=============== New Balance =====================");
        System.out.println(from.getAccountBalance());
        System.out.println(to.getAccountBalance());
    }
    // deposit

}
