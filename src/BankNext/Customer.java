package BankNext;

import java.util.List;
import java.util.ArrayList;

public class Customer<T> {
   private List<Account<T>> accounts;
   String firstName;
   String lastName;
   
   Customer(String firstName, String lastName) {
      this.accounts = new ArrayList<Account<T>>();
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public void addAccount(Account<T> account) {
      accounts.add(account);
   }
   
   public int getNumOfAccounts(){
      return accounts.size();
   }
   
   public Account<T> getAccount(int index){
      return accounts.get(index);
   }
   
   public String getFirstName(){
      return this.firstName;
   }
   
   public String getLastName(){
      return this.lastName;
   }
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   public void setAccount(int index, Account<T> account){
      accounts.set(index, account);
   }
   
   
   
}
