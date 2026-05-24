
package Day2;

import models.*;
/**
 *
 * @author youss
 */
public class Day2 {

    public static void main(String[] args) {
        SavingsAccount savingsaccount1 = new SavingsAccount("Armin Arlert", 430000.00,3.5);
        CheckingAccount checkingaccount1 = new CheckingAccount("Nathan Jacobs", 3200,5000);
        System.out.println(savingsaccount1.owner + " - " + savingsaccount1.balance + " - " +savingsaccount1.interestRate);
        System.out.println(checkingaccount1.owner + " - " + checkingaccount1.balance + " - " +checkingaccount1.overdraftLimit);
        System.out.println("Before: " + savingsaccount1.balance);
        savingsaccount1.deposit(5000);
        System.out.println("updated amount: " + savingsaccount1.balance);
        try {
            savingsaccount1.withdraw(999999);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            savingsaccount1.withdraw(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("After failed withdrawals: " + savingsaccount1.balance);
        SavingsAccount savingsaccount2 = new SavingsAccount("Rico Verhoeven", 32430123.12,3.5);
        CheckingAccount checkingaccount2 = new CheckingAccount("Jon Snow", 324.12,100);
        try {
            savingsaccount2.deposit(500);
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            checkingaccount2.deposit(500);
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        savingsaccount2.applyInterest();
        System.out.printf("New Balance: %.2f%n", savingsaccount2.balance);
        try {
            checkingaccount2.withdraw(375);
            System.out.println("Withdrew 375 - Balance: " + checkingaccount2.balance);
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            checkingaccount2.withdraw(500);
            System.out.println("Withdrew 500 - Balance: " + checkingaccount2.balance);
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            checkingaccount2.withdraw(-500);
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
