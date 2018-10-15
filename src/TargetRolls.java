/**
 * Erin Bevec
 * AP Comp Sci
 * Target Roll Method
 */
import java.util.Scanner;
public class TargetRolls 
{

	public static void main(String[] args)
	{
		DiceRoll rolling = new DiceRoll();
		Scanner in = new Scanner(System.in);
		int die1 = rolling.roll();
		int die2 = rolling.roll();
		boolean play = true;
		while (play == true) 
		{
			System.out.println("Please input a value between 2 and 12:");
			String value = in.next();
			in.nextLine();
			int changedValue = Integer.parseInt(value);
			if (2 <= changedValue && 12 >= changedValue)
			{
				System.out.println("You are rolling for a " + changedValue);
				boolean game = true;
				while (game == true) 
					{
					die1 = rolling.roll();
					System.out.println("Your first roll is " + die1);
					die2 = rolling.roll();
					int sum = die1 + die2;
					System.out.println("Your second roll is " + die2);
					System.out.println("The sum of the rolls is " + sum);
					if (die1 + die2 == changedValue)
					{
						game = false;
						int rollCount = rolling.getNumRolls();
						System.out.println("You rolled the target number!");
						System.out.println("You rolled  " + die1 + " and " + die2);
						System.out.println("It took you " + rollCount + " rolls to get the target.");
					}
					else 
					{
					game = true;
					}
			}
				}
			else 
				{
					System.out.println("Invalid input value.");
					play = true;
				}
			}
		}
	}

