/**
 * 
 */
package practice.CodeChef.Easy;

import java.util.Scanner;

/**
 * @author Arun.G
 *
 */
public class LifetheUniverseandEverything {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int number = 0;
//get and print number until we get a 42
while((number=sc.nextInt())!= 42)
	System.out.println(number);

sc.close();

	}

}
