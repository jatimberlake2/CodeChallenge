import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Discover10Friendly {

	public static void main(String[] args) 
	{
		while (true)
		{
//			System.out.println(Arrays.toString(readIO()));
			int upperBound = readIO();

	        if (upperBound == -1)
	            System.out.println("Element is not a positive integer.");
	        else
	        	System.out.println(upperBound);

		}
	}
	
	public static int readIO()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value of N.");		// Telling you what to do.
		String n = scan.nextLine();								// Reading in what you want to scan
		String regexCheck = "[0-9]+";							// We only want input of pure digits, so that's the first step.
		Pattern p = Pattern.compile(regexCheck);
		if (p.matcher(n).matches())
			return Integer.parseInt(n);
		return -1;
	}

}
