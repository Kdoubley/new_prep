
package models;

/**
 *
 * @author youss
 */
public abstract class BankAccount {
    public String owner;
    public double balance;
    
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    
    public void deposit(double amount){
    if (amount <= 0){
        throw new IllegalArgumentException("Invalid deposit amount");
    } else {
        balance += amount;
    }}
    
    public void withdraw(double amount){
    if (amount <= 0 || amount > balance){
        throw new IllegalArgumentException("Invalid withdrawal amount");
    } else {
        balance -= amount;
    }
    }
}



