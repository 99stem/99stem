/*
* Made by me 99stem for personal reasons
*/

import java.util.Scanner;

public class a
{
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    
    Scanner ifStatement = new Scanner(System.in);
    System.out.println("Enter value for X: ");
    int x = ifStatement.next();
    
    if(x > 0)
    {
      System.out.println("The value you entered is higher than 0");
    }
    else
    {
      System.out.println("The value you entered is NOT higher than 0");
    }
  }
}
