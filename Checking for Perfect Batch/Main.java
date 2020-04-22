import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=in.nextInt();
    }
    perfect_batch(list,n);
  }
  public static void perfect_batch(int list[],int n)
  {
    int sum=0,res=0;
    for(int i=0;i<=2;i++)
    {
      sum=sum+list[i];
    }
    for(int i=3;i<=5;i++)
    {
      res=res+list[i];
    }
    if(sum==res)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
  }
