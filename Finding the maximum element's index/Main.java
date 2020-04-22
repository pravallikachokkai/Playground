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
    max_index(list,n);
  }
  public static void max_index(int list[],int n)
  {
    int max,position=0;
    if(list[0]>list[1])
    {
      max=list[0];
    }
    else
    {
      max=list[1];
    }
    for(int i=2;i<n;i++)
    {
      if(max<list[i])
      {
        max=list[i];
         position=i;
      }
    }
     System.out.println(position);
  }
      }
      
  
