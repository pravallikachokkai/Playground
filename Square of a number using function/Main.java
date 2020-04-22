import java.util.Scanner;
class Main
{
	public static int square(int m)
    {
      int num=m*m;
      return num;
    }
  public static void main (String[] args)
    {
	 // Type your code here 
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int res=square(n);
    n=res;
    System.out.println(n);
  }
	} 
