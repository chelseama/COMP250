import java.util.*;
  
public class Pascal {
  public static int pascalTriangle (int m, int n) {
  
   if (n<0 || m<n)
    return 0;
   else if (n==0 || m==n)
    return 1;
   
 
   else return pascalTriangle(m-1,n-1)+pascalTriangle(m-1,n);

 }
  public static void main(String[] args) {
    for(int m=0; m<6; m++) {
      for(int n=0; n<=m; n++) {
        String x=Integer.toString(pascalTriangle(m,n));
        
        
          System.out.print(x);
        
        
       }
      System.out.print("\n");}
  }
  
}
      