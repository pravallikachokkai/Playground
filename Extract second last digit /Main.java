import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int second_last_digit=(n/10)%10;
      System.out.println(second_last_digit);
      
	}
}