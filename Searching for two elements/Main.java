import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int search_element1=in.nextInt();
      int search_element2=in.nextInt();
      int index1=-1;
      int index2=-1;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(search_element1==arr[i])
        {
          index1=i;
        }
        else if(search_element2==arr[i])
        {
          index2=i;
        }
      }
      System.out.println(index1);
      System.out.println(index2);
      
    }
}