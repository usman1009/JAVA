import java.util.Scanner;
public class SortString{
    public static void main(String args[])
    {
      int count;
      String temp;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of strings you would like to enter:");
      count =sc.nextInt(); 
      String str[]=new String[count];
      Scanner s = new Scanner(System.in);
      System.out.println("enter the string one by one:");
      for(int i =0;i<count; i++)
      {
          str[i] = s.nextLine();
      }
      sc.close();
      s.close();
      for (int i = 0; i < count; i++) 
      {
          for (int j = i + 1; j < count; j++) { 
              if (str[i].compareTo(str[j])>0) 
              {
                  temp = str[i];
                  str[i] = str[j];
                  str[j] = temp;
              }
          }
      }
      
      //Displaying the strings after sorting them based on alphabetical order
      System.out.print("Strings in Sorted Order:");
      for (int i = 0; i <= count - 1; i++) 
      {
          System.out.print(str[i] + ", ");
      }
  }
}