import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int three_digit_no=n/100;
      System.out.println(three_digit_no);
	}
}