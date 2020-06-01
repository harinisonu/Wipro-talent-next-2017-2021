/******************************************

Write a program to check if the program has received command line arguments or not. If the
program has not received the values then print "No Values", else print all the values in a single line
separated by ,(comma).
Eg1) java Example
O/P: No values
Eg2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore

******************************************/
public class FlowControlSt3
{
	public static void main(String[] args) 
	{		
		if(args.length == 0)
		{
			System.out.print("No Values");
		}
		else
		{
			for(int i=0; i<args.length;i++)
			{
				System.out.print(args[i]+",");
			}
		}

	}
}
