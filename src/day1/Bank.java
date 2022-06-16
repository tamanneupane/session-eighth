package day1;

import java.math.BigDecimal;

public class Bank {

    public static void main(String[] args) {

        Account account1 = new Account();

//      account1.accountNumber = "123456789";
        account1.setAccountNumber("123456789");

//        account1.accountHolderName = "Taman Neupane";
        account1.setAccountHolderName("Taman Neupane");

//        account1.accountType = AccountType.SALARY;
        account1.setAccountType(AccountType.SALARY);

//        account1.accountBalance = 50000.5f;
        account1.setAccountBalance(BigDecimal.valueOf(500));

//        account1.bankName = "GBIME";

//        account1.branch = "Baneshwor";
        account1.setBranch("Baneshwor");

//        account1.ssn = "111111111";
        account1.setSsn("111111111");


        Account account2 = new Account();
//        account2.accountNumber = "987654321";
        account2.setAccountNumber("987654321");

        account2.setAccountBalance(BigDecimal.valueOf(200));

//        account2.ssn = "2222222222";
        account2.setSsn("2222222222");

////        System.out.println(account1.accountNumber);
//        System.out.println(account1.getAccountNumber());
//
////        System.out.println(account2.accountNumber);
//        System.out.println(account2.getAccountNumber());

        //Transfer Balance 200 from account 1 to account 2
        BigDecimal balanceToBeTransferred = BigDecimal.valueOf(200);
        account1.transferBalance(account1, account2, balanceToBeTransferred);
    }
}
