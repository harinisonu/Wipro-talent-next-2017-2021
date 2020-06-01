/*******************************************************************************
 
 
Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e

 
 *******************************************************************************/

public class FlowControlSt4
{
	public static void main(String[] args) 
	{		
		char n1='a';
		char n2='e';
		if(n1<n2)
			System.out.print(n1+","+n2);
		else
			System.out.print(n2+","+n1);

	}
}
