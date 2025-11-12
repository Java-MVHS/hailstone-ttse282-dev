// Hayden Tse
// 11-7-25
// Hailstone.java
// Working on: loops, if else
/* Hailstone.java would prompt the user for a positive integer ranging from
 * 1-10000. If the number is an even number, the program would recognize it and 
 * doubles it. If it is an odd number the program would multiply by 3 and adds 1
 * until the number is 1 and would print how many times the loop was executed. 
 * The program keeps prompting the user for numbers until the user types -1 to exit.
 */

import java.util.Scanner;
public class Hailstone
{
	int count, num;
	
	public Hailstone()
	{
		count = 0;
		num = -1;
	}
	
	public static void main (String[] args)
	{
		Hailstone hs = new Hailstone();
		hs.findIt();
	}
	
	public void findIt()
	{
		System.out.println("\n\n\n");
		System.out.println("Welcome to Hailstone!");
		do
		{
			getNum();
		
			if (num == -1)
			{
				printIt();
			}
			else if(num < 0)
			{
				printIt();
			}
			else 
			printSequence();
			
		}while(num != -1);
		
	}
	
	public void getNum()
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("\n\n\n");
		System.out.print("Enter a postive integer (1 - 10000). Enter -1 to exit: ");
		num = keyboard.nextInt();
	}
	
	public void printSequence()
	{
		do
		{
			System.out.printf("%8d", num);
			
			if(num%2 ==1)
			{
				num = num*3 + 1;
				count++;
			}
			else
			{
				num = num/2;
				count++;
			}
			
		}while(num != 1);
		
		System.out.println("\nThe loop was executed " + count + " times.");
		count = 0;
	}
	
	public void printIt()
	{
		if (num == -1)
		{
			System.out.println("Thanks for playing Hailstone!");
			System.out.println("\n\n\n\n");
		}
		else if (num<1)
		{
			System.out.println("Please enter a valid number");
		}
	}
}
