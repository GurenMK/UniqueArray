
public class Assignment_2 {

   public static double mean(int[] array) { //mean method    
      double total = 0;
      for (int i = 0; i < array.length; i++) {
         total += array[i];
      }
      double mean = total / array.length;
      return mean;
   } //mean method
   
      public static int mode(int[] array) { //mode method    
      int max = 0;
      int result = 0;
      for (int i = 0; i < array.length; ++i) {
         int count = 0;
         for (int j= 0; j < array.length; ++j) {
          if (array[j] == array[i]) 
            ++count;
          }
         if (count > max) {
             max = count;
             result = array[i];
         }
      }
      return result;
   } //mode method
   
    public static void main(String[] args) {
         int[] array = new int[10];
         for (int i = 0; i < array.length; i++) {
             array[i] = 1 + (int)(Math.random() * 20);  
            for (int j = 0; j < i; j++) {
                if(array[i] == array[j]){          
                 i--;    //if [i] is a duplicate run the outer loop again 
                 break;
                }
            }
         }
         for (int m = 0; m < array.length; m++) {         
                 System.out.println(array[m]);  
         }
         System.out.printf("\n%s %4.2f", "Mean:", mean(array));
         System.out.println("\nMode: " + mode(array));
    }
}