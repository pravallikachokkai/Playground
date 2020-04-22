import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.print(gcd_of_three_numbers(n1,n2,n3));
	}
  public static int gcd_of_three_numbers(int n1,int n2,int n3)
  {
    int second=0,min,gcd=0,res=0;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while(min>=1)
    {
      if((n1%min==0)&&(n2%min==0))
      {
        second=min;
        break;
      }
      min--;
    }
    if(second<n3)
    {
      res=second;
    }
    else
    {
      res=n3;
    }
    while(res>=1)
    {
      if((second%res==0)&&(n3%res==0))
      {
        gcd=res;
        break;
      }
      res--;
    }
    return gcd;
  }
}