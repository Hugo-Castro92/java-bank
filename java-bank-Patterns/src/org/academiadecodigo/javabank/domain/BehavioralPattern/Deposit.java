package org.academiadecodigo.javabank.domain.BehavioralPattern;


import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.precisiondouble.DoubleInputScanner;
import java.util.*;


public class Deposit implements MenuOption{


	@Override
	public void executeOption(Customer customer) {

		Set<Integer> accountsNumer = customer.getAccountNumber();
		Prompt prompt = new Prompt(System.in, System.out);

		IntegerSetInputScanner scanner = new IntegerSetInputScanner(accountsNumer);
		scanner.setMessage("Chose one of your account's ID: (" + accountsNumer.toString() + ") :");

		int accountId = prompt.getUserInput(scanner);

		DoubleInputScanner amountScanner = new DoubleInputScanner();
		amountScanner.setMessage("Chose the amount of money you want to Deposit: ");

		double amount = prompt.getUserInput(amountScanner);

		AccountManager accountManager = customer.getAccountManager();
		accountManager.deposit(accountId, amount);
	}
}