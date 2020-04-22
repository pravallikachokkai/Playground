import java.util.*;
class Main
{
	public static void main (String[] args)
    {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int first_digit=n/10;
      int second_digit=n%10;
      int sum=first_digit+second_digit;
      System.out.println(sum);
	}
}