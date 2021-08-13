package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int numAccount = sc.nextInt();
        String not = sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there initial deposit (Y/N): ");
        String option = sc.nextLine();
        String optionY = "Y";
        Account account;
        if (option.equals(optionY)){
            System.out.print("Enter initial deposit value: ");
            double iniDeposit = sc.nextDouble();
            account = new Account(numAccount, name, iniDeposit);
        }
        else {
            account = new Account(numAccount, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a whitdraw value: ");
        value = sc.nextDouble();
        account.saque(value);

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        sc.close();
    }
}
