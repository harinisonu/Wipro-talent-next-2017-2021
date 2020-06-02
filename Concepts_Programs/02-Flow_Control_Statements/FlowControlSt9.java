/*******************************************************************************
 
9)

Write a program to print month in words, based on input month in numbers
Example1:
C:\>java Sample 12
O/P Expected : December
Example2:
C:\>java Sample
O/P Expected : Please enter the month in numbers
Example3:
C:\>java Sample 15
O/P Expected : Invalid month
Topics Covered: Switch Statement
 
 *******************************************************************************/
 
 
import java.util.*;
public class FlowControlSt9
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month Represented As Number: ");
		int month = sc.nextInt();
		switch(month)
		{
		case 1 : System.out.print("January");
		break;
		case 2 : System.out.print("February");
		break;
		case 3 : System.out.print("March");
		break;
		case 4 : System.out.print("April");
		break;
		case 5 : System.out.print("May");
		break;
		case 6 : System.out.print("June");
		break;
		case 7 : System.out.print("July");
		break;
		case 8 : System.out.print("August");
		break;
		case 9 : System.out.print("September");
		break;
		case 10 : System.out.print("October");
		break;
		case 11 : System.out.print("November");
		break;
		case 12 : System.out.print("December");
		break;
		default: System.out.print("Invalid month");
		}
	}
}
