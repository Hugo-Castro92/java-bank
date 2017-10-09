package org.academiadecodigo.javabank.domain.BehavioralPattern;

import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.AccountType;
import java.util.Scanner;


public class CreateAccount implements MenuOption {

    @Override
    public void executeOption(Customer customer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Checking\n2.Savings");
        int optn = scanner.nextInt();

        if (optn == 1){

            customer.openAccount(AccountType.CHECKING);
        }

        if(optn == 2){

            customer.openAccount(AccountType.SAVINGS);
        }

        System.out.println("Success! Your new account is now available");
    }
}
