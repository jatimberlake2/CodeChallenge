import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Discover10Friendly {

	public static void main(String[] args) 
	{
		while (true)
		{
//			System.out.println(Arrays.toString(readIO()));		// Used for testing purposes
			int upperBound = readIO();
			ArrayList<Integer> list = new ArrayList<Integer>();		// Create an array list for the output values

	        if (upperBound == -1)						// This rejects the output if it isn't an integer >= 0
	            list = new ArrayList<Integer>();
	        else
	        {
	        	for (int i = 0; i <= upperBound; i++)
	        	{
	        		if (addRecursively(i) == 10)		// Check which values between 0 and upperBound are "10-substring friendly"
	        			list.add(i);					// Add results to the output list
	        	}
	        }
	        printResults(list);	// Generate the final output as desired.
		}
	}
	
	public static int readIO()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value of N.");		// Telling you what to do.
		String n = scan.nextLine();								// Reading in what you want to scan
		String regexCheck = "[0-9]+";							// We only want input of pure digits, so that's the first step.
		Pattern p = Pattern.compile(regexCheck);
		if (p.matcher(n).matches())						// This also gets rid of "-" signs
			return Integer.parseInt(n);					// Only return integer representation of numerical valued Strings
		return -1;
	}
	
	public static int addRecursively(int num)		// Simple recursive algorithm to add all digits within an integer
	{
		if (num == 0)
			return num;
		return ( num % 10 + addRecursively ( num / 10));	// add each "digit place" (divided by 10 each place movement)
	}

	public static void printResults(ArrayList<Integer> outputList)
	{
	       String result = "[";			
	       for (int i = 0; i < outputList.size(); i++)
	       {
	    	   int num = outputList.get(i);
	    	   if (i < outputList.size() - 1)
		    	   result += num + ", ";
	    	   else
	    		   result += num;
	       }
	       result += "]";
	       
	       System.out.println(result);
	}
	
}
