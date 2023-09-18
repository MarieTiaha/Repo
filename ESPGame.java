/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Write a program that tests your ESP (extrasensory perception). Create a list of the seven names of colors. 
 * Due: 09/11/2023
 * Platform/compiler:eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: ____Marie Jeanne Choualeu Tiaha______
*/


import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rightGuesses = 0;


        final String COLOR_RED = "Red";
        final String COLOR_GREEN = "Green";
        final String COLOR_BLUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";
        final String COLOR_PURPLE = "Purple";
        final String COLOR_PINK = "Pink";
        
        
		String name, description,dueDate;
		int mcNumber;
		
		System.out.print("Enter your name: ");
	    name = scanner.nextLine();
	     
	    System.out.print("Describe yourself: ");
	    description = scanner.nextLine();
	    
	     
	    System.out.print("Enter your MC M#: ");
	    mcNumber = scanner.nextInt();
	    
	    System.out.print("Enter your Due Date (MM/DD/YY): ");
	    dueDate = scanner.nextLine();
	    
	    scanner.nextLine();
	        
	    System.out.println("CMSC203 Assignment1: Test your ESP skills!");
	    
	    for (int round = 1; round <= 11; round++) 
	    {
            System.out.println("\nRound " + round);
            int randomNum = (int) (Math.random() * 7);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange,Yellow,Pink, or Purple");
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine();
            
            if (userGuess.equalsIgnoreCase(COLOR_PINK)&& randomNum==1) 
            {
                System.out.println("I was thinking of " + COLOR_PINK + ".");
                rightGuesses++;
            }
            else if (userGuess.equalsIgnoreCase(COLOR_RED)&& randomNum==2) 
            {
               System.out.println("I was thinking of " + COLOR_RED + ".");
               rightGuesses++;
            }
            
            else if (userGuess.equalsIgnoreCase(COLOR_GREEN)&& randomNum==3) 
            {
                System.out.println("I was thinking of " + COLOR_GREEN + ".");
                rightGuesses++;
            }
            
            else if (userGuess.equalsIgnoreCase(COLOR_BLUE)&& randomNum==4) 
            {
                System.out.println("I was thinking of " + COLOR_BLUE + ".");
                rightGuesses++;
            }
            
            else if (userGuess.equalsIgnoreCase(COLOR_ORANGE)&& randomNum==5)
            {
                System.out.println("I was thinking of " + COLOR_ORANGE + ".");
                rightGuesses++;
            }            
	    	else if (userGuess.equalsIgnoreCase(COLOR_PURPLE)&& randomNum==6) 
            {
                System.out.println("I was thinking of " + COLOR_PURPLE + ".");
                rightGuesses++;
            }
            
            else if (userGuess.equalsIgnoreCase(COLOR_YELLOW)&& randomNum==7) 
            {
                System.out.println("I was thinking of " + COLOR_YELLOW + ".");
                rightGuesses++;
            }
            else 
            {
               System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow? ");
               System.out.println("Enter your guess again: ");
            }
	
            
        }

        // Game over message
        System.out.println("\nGame Over");
        
        System.out.println("You guessed " + rightGuesses + " out of 10 colors correctly.");
        System.out.println("Name: " + name);
        System.out.println("MC M#: " + mcNumber);
        System.out.println("Description: " + description);
        System.out.println("Due Date: " + dueDate);
    }
}
