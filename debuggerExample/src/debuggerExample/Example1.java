package debuggerExample;

/**
 * Example1.java - A simple example of how to use a debugger to find issues.
 * 
 * Example1 is a program with a constructor (init) and a periodic update method.
 * Other code ensures the periodic update method gets called many times while the code is being executed
 * You don't have to worry about that, just trust that the constructor will get run once, then
 *  the periodic code will get run many times (until you stop the program yourself)
 * 
 * Example1's job is to print out all odd numbers in the range 1 to 15 inclusive. Inclusive here means that
 *  the endpoints of the range (1 and 15) should be considered in the output. AKA, since 1 and 15 are both
 *  odd, we should expect to see 1 and 15 get printed out (along with all other odd numbers between them).
 *  
 * However, currently, example 1 does not do that. Use the debugger to figure out why, and fix it.
 */

public class Example1 implements Example {
	
	int curNumber;
	
	final int END_NUMBER = 15;
	
	//Constructor
	public Example1(){
		System.out.println("I'm going to try to list all odd numbers between 1 and 15 (inclusive)");
		
		curNumber = 1;
		
	}
	
	//Periodic update function - this is called many times during execution
	public void periodicUpdate(){
		
		int remainder;
		
		if(curNumber < END_NUMBER){
			
			//Move on to the next number
			curNumber++;
			
			//When divided by two, odd numbers will have a remainder of 1.
			//When you want to know remainder after division of integers, use the modulo (%) operator
			remainder = curNumber % 2;
			
			if(remainder == 1){
				System.out.print(curNumber);
				System.out.println(" is an odd number.");
			}
			
		} else {
			//we've hit the end, nothing else to do
		}
		
	}

}
