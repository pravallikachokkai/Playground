import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int rem=0;
      int sum=0;
      while(n>0)
      {
        rem=n%10;
        sum=rem+sum;
        n=n/10;
      }
      System.out.println(sum);
	}
}