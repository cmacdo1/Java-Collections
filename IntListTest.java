// ***************************************************************
// IntListTest.java
//
// Driver to test IntList methods.
// ***************************************************************

import java.util.Scanner;

public class IntListTest
{
	private static Scanner scan;
	private static IntList list = new IntList();

	//----------------------------------------------------------------
	// Creates a list, then repeatedly prints the menu and does what
	// the user asks until they quit.
	//----------------------------------------------------------------
	public static void main(String[] args)
	{
		scan = new Scanner(System.in);
		int choice = 0;
		
		do
		{
			printMenu();
			choice = scan.nextInt();
			dispatch(choice);
			
		}
		while (choice != 0);
	}

	//----------------------------------------
	// Does what the menu item calls for.
	//----------------------------------------
	public static void dispatch(int choice)
	{
		int oldVal, newVal;
		switch(choice)
		{
		case 0:
			System.out.println("\nGoodbye!");
			break;

		case 1: //add to front
			System.out.print("\nEnter integer to add to front: ");
			newVal = scan.nextInt();
			list.addToFront(newVal);
			break;

		case 2: //add to end
			System.out.print("\nEnter integer to add to end: ");
			newVal = scan.nextInt();
			list.addToEnd(newVal);
			break;

		case 3: //remove first element
			list.removeFirst();
			break;

		case 4: //print
			list.print();
			break;
			
		case 5: //length
			System.out.println("\nCount: " + list.length());
			break;
			
		case 6: //prints toString of list
			System.out.println(list.toString());
			break;
			
		case 7: //remove from end
			list.removeLast();
			break;
			
		case 8: //replace oldVal with newVal
			System.out.print("\nEnter old value to replace: ");
			oldVal = scan.nextInt();
			System.out.print("Enter new value to use: ");
			newVal = scan.nextInt();
			list.replace(oldVal, newVal);
			break;
				
		default:
			System.out.println("Sorry, invalid choice");
		}
	}


	//-----------------------------------------
	// Prints the user's choices
	//-----------------------------------------
	public static void printMenu()
	{
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Add an integer to the front of the list");
		System.out.println("2: Add an integer to the end of the list");
		System.out.println("3: Remove an integer from the front of the list");
		System.out.println("4: Print the list");
		System.out.println("5: Display the number of elements in the list");
		System.out.println("6: Print toString list");
		System.out.println("7: Remove an integer from the end of the list");
		System.out.println("8: Replace old value with new value in the list");

		System.out.print("\nEnter your choice: ");
	}
}
