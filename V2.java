/******************************************************************************

Make a calculator app
Get a number, operation, 2nd number
Do the operation
Have the user guess the answer
Tell them if they are right or wrong

*******************************************************************************/
import java.util.Scanner;

public class V2
{
  public static void main (String[]args)
  {

    double num1 = 0;
    double num2 = 0;
    double compans = 0;
    double userans = 0;
    String operation = "nothing";

    Scanner sc = new Scanner (System.in);

      System.out.println ("Enter a number.");
      num1 = sc.nextDouble ();
      System.out.println ("Enter another number.");
      num2 = sc.nextDouble ();
      operation = sc.nextLine ();
      System.out.
      println
      ("Enter an operation (type add, subtract, multiply, or divide).");
      operation = sc.nextLine ();

    if (operation.equals ("add"))
      {
	compans = (num1 + num2);
      }
    else if (operation.equals ("subtract"))
      {
	compans = (num1 - num2);
      }
    else if (operation.equals ("multiply"))
      {
	compans = (num1 * num2);
      }
    else if (operation.equals ("divide"))
      {
	compans = (num1 / num2);
      }
    else
      {
	System.out.println ("Error");
      }

    System.out.println ("Guess the answer.");
    userans = sc.nextDouble ();
    if (userans == compans)
      {
	System.out.println ("Good job.");
      }
    else
      {
	System.out.println ("Wrong.");
      }

    System.out.println ("The answer is " + compans + ".");

  }
}
