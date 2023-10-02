package BankNext;
import java.util.List;
import java.util.ArrayList;


public class Bank<T> {
   private List<Customer<T>> customers;
   private String bankName;
   
   Bank(String bankName){
      customers = new ArrayList<Customer<T>>();
      this.bankName = bankName;
   }
   
   public void addCustomer(Customer<T> customer){
      customers.add(customer);
   }
   
   public String getBankName(){
      return this.bankName;
   }
   
   public int getNumOfCustomers(){
      return customers.size();
   }
   
   public Customer<T> getCustomer(int index){
      return customers.get(index);
   }
   
   public void setCustomer(int index, Customer<T> customer){
      customers.set(index, customer);
   }
   
   public void setBankName(String bankName){
      this.bankName = bankName;
   }
   
}
