import java.util.*;
import java.util.Scanner;

public class Q3 {
 public static void main(String[] args) 
 {
   int[] a = {1,4,4,3,4,3,5,2,1};
   Q3.getCount(a);

 }

 public static void getCount(int a[]) {
  int num1 = 20; //any number bigger than a.length()    
   int count;   
   String s="";
   for(int i=0;i<a.length;i++)
   {
    count=0;

     for(int j=0; j<a.length; j++) 
     {
       if(a[i]==a[j]) 
        count++;   
     }
     if(count==num1)
     {
       num1=count;
       s=s+ " " +a[i];
     }
     else if(count<num1)
     {
       num1=count;
       s=" " +a[i];
     }
   }
   System.out.println("Elements:"+ s);
   System.out.println("Number of occurrences:"+ num1);
   }
 }
