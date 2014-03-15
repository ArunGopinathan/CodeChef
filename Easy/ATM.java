/**
 * 
 */
package practice.CodeChef.Easy;

import java.util.Scanner;

/**
 * @author Arun.G
 *
 */
public class ATM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int transAmt = sc.nextInt();
float balance = sc.nextFloat();
//is multiple of 5
if(transAmt%5==0)
{
	//check if enough balance to with draw amount
	if((balance -transAmt)>=0.5)
	{
		balance = (float) (balance - (float)transAmt - 0.5);
		System.out.println(String.format("%.2f", balance) );
	}
	else //insufficient funds
	{
		System.out.println(String.format("%.2f", balance) );
	}
}
else //else not valid amount
{
	System.out.println(String.format("%.2f", balance) );
}


sc.close();

	}

}
