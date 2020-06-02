/*******************************************************************************
 
8)

Write a program to print the color name, based on color code. If color code in not valid then print
"Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
Topics Covered: Switch Statement
 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt8
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'R': System.out.print("RED");
		break;
		case 'B': System.out.print("BLUE");
		break;
		case 'G': System.out.print("GREEN");
		break;
		case 'O': System.out.print("ORANGE");
		break;
		case 'Y': System.out.print("YELLOW");
		break;
		case 'W': System.out.print("WHITE");
		break;
		}
	}
}
