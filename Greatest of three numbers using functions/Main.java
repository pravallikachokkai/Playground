import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(greatest_of_3_numbers(n1,n2,n3));
	}
    public static int greatest_of_3_numbers(int n1,int n2,int n3)
    {
      int second,res=0;
      if(n1>n2)
      {
        second=n1;
      }
      else
      {
        second=n2;
      }
      if(second>n3)
      {
        res=second;
      }
      else
      {
        res=n3;
      }
    
  return res;
}
}