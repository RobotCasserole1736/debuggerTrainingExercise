package debuggerExample;

import java.util.Scanner;

public class Main {
	
	static Example ex1;
	
	/**
	 *  Note to students - This class is skeleton to run the examples which we work through.
	 *  Although you are welcome to look around, don't get too bogged down by this. The code
	 *  you care about is inside of each of the Example*.java classes.
	 *  
	 *  Move along, nothing to see here...
	 *  
	 * @param args command line input... unused
	 */
	public static void main(String[] args){
	    //Main execution begins here
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Select Example to work on:");
		int n = reader.nextInt();
		
		if(n == 1){
			ex1 = new Example1();
		} else {
			System.out.println("Invalid selection, please restart and try again");
			return;
		}
		
		while(true){
			ex1.periodicUpdate();
			
			// "real time loop scheduling"
			try {
				Thread.sleep(20); 
			} catch (InterruptedException e) {
				System.out.println("ummmmm, ask a mentor.");
				e.printStackTrace();
			}
		}
		
		//Program will exit only when the user stops it
	}
}
