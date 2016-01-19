import java.lang.*;
import java.util.Random;
import java.util.*;
public class SortBenchmark {
  public static void main(String[] args) {
    if (args.length>0) {
      int n = Integer.parseInt(args[0]);
     
      Integer[] a = new Integer[n];  
      
      Random R =new Random(3);
      
      for(int i=0;i<n;i++) 
        a[i] = R.nextInt(1000);
      
      long one=System.currentTimeMillis();
      quickSort.quicksort(a);
      long two=System.currentTimeMillis();
      
      R=new Random(3);
      for(int i=0;i<n;i++) 
        a[i] = R.nextInt(1000);
      
      long three=System.currentTimeMillis();
      MergeSort.sort(a);
      long four=System.currentTimeMillis();
      
      R=new Random(3);
      for(int i=0;i<n;i++) 
        a[i] = R.nextInt(1000);
      
      long five=System.currentTimeMillis();
      SelectionSort.sort(a);
      long six=System.currentTimeMillis();
      
      System.out.println((two-one) +" "+ (four-three) +" "+ (six-five));
      
      
  }
 }
}
