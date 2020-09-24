import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Discover10Friendly {

	public static void main(String[] args) 
	{
		while (true)
		{
			System.out.println(Arrays.toString(readIO()));
		}
	}
	
	public static int[] readIO()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value of N.");		// Telling you what to do.
		String n = scan.nextLine();								// Reading in what you want to scan
		String regexCheck = "[0-9]+";							// We only want input of pure digits, so that's the first step.
		Pattern p = Pattern.compile(regexCheck);
		int[] nums = new int[n.length()];
		if (p.matcher(n).matches())
		{
			for (int i = 0; i < n.length(); i++)
				nums[i] = Character.getNumericValue(n.charAt(i));		// Converting all characters in the string to an array of ints for searching and comparing
		}
		else
			nums = new int[0];
		return nums;
	}

}
