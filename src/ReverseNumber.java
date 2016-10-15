import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//Create Scanner Object
		Scanner UserInput = new Scanner(System.in);
		
		//Prompt for user input
		System.out.println("Enter the amount of numbers you would like to be reversed: ");	
		//User Input happens here
		int values = Integer.parseInt(UserInput.nextLine());
		
		//Creating array that will store numbers entered
		int lenumbers[] = new int[values];
		System.out.println("Now enter le numbers!");
		
		//As long as number doesn't pass amount of #'s they want reversed, keep asking!
		for (int i=0; i < lenumbers.length; i++) {
			System.out.print("Enter number: ");
				lenumbers[i] = UserInput.nextInt();
		}
		
		//Create variable reverseorder to store math in
		int reverseorder;
		//traverse through half the array
		for(int i = 0; i < lenumbers.length/2; i++) {
			//grabs last position in array at the moment 
			reverseorder = lenumbers[lenumbers.length-i-1];
			//assigns last position to the 0 position of array
			lenumbers[i] = lenumbers[lenumbers.length-i-1];
			//stores new order to array
			lenumbers[i] = reverseorder;	
		}		
		
		//Prints array
		for (int i = 0; i < lenumbers.length; i++) {
			System.out.print(lenumbers[i]);
		}
	}
}

