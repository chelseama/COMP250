public class Recursion {
  public static void main(String[] args) {
    if (args.length>0)
    {
    //n represents number of binary strings
    int n = Integer.parseInt(args[0]);  
    System.out.println (countBinaryStrings(n));
    }
  }
  
  //i represents length of binary strings
  //the pattern between length of binary strings i and number of binary strings n is finobacci function
  
  public static int countBinaryStrings(int i)
  {
    if (i==1) //f1
    { return 2;
    }
    if (i==2) //f2
    { return 3;
    }
    return countBinaryStrings(i-1) + countBinaryStrings(i-2); //fn= fn-1 + fn-2
  }
  
}
