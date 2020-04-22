import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=sb.length();
      int front = 0;
      int end = str_len-1;
      boolean match=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          match=false;
          break;
        }
        front++;
        end--;
      }
      if(match==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
    } 
}