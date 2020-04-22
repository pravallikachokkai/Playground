import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int temp=n;
      while(n>0)
      {
        int rem=n%10;
        int fact=1;
        for(int i=1;i<=rem;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
      }
      if(temp==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}