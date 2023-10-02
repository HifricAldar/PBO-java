package BankNext;
public class Account<T> {
   private T id;
   private String date;
   
   Account(T id, String date) {
      this.id = id;
      this.date = date;
   }
   
   public T getId() {
      return this.id;
   }
   
   public String getDate(){
      return this.date;
   }
   
   public void setId(T id) {
      this.id = id;
   }
   
   public void setDate(String date) {
      this.date = date;
   }
   
}
