/*******************************************************************************
 
20)

Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After
performing the operation, the program should ask the user if he wants to continue. If the user
presses y or Y, then the program should continue displaying the menu else the program should
terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]
Topics Covered: Do While.
 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt20
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while(flag == 1)
		{
			System.out.println("MENU");
			System.out.println("1. Add\n2. Sub");	
			int option = sc.nextInt();
			System.out.println("Enter positive no1");
			int num1 = sc.nextInt();
			System.out.println("Enter positive no2");
			int num2 = sc.nextInt();		
			if(option==1)
			{
				System.out.println(num1+num2);
			}
			else if(option == 2)
			{
				System.out.println(num1-num2);
			}
			System.out.println("Enter 'y' or 'Y' to continue ");
			Character ch = sc.next().charAt(0);
			if(ch.equals('y') || ch.equals('Y'))
			{	
				flag=1;
			}	
			else
			{
				flag=0;
			}
		}
	}
}
