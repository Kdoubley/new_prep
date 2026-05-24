
package models;

/**
 *
 * @author youss
 */
public class CheckingAccount extends BankAccount {
    public double overdraftLimit;
    public CheckingAccount(String owner, double balance, double overdraftLimit){
        super(owner, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount){
        if ( amount <= 0){
            throw new IllegalArgumentException("Enter valid withdrawal amount");
        } else if(balance + overdraftLimit < amount){
            throw new IllegalArgumentException("Exceeded overdraft limit");
        }else { 
            balance -= amount;
        }}
}

