
package models;

/**
 *
 * @author youss
 */
public class SavingsAccount extends BankAccount {
    public double interestRate;
    public SavingsAccount(String owner, double balance, double interestRate){
        super(owner, balance);
        this.interestRate = interestRate;
    }
    public void applyInterest() {
    balance += balance * (interestRate / 100);
    }
}
