public class PrintNumIncOrder {
  
  
  public static void incorder(int num){
      
      if (num==1) {
        System.out.print(1 + " ");
        return; 
      }
      incorder(num-1);
      System.out.print(num + " ");
      
  }
  
  
    public static void main(String[] args) {
       incorder(10);
    }
}
