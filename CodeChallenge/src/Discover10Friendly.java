import java.util.Scanner;
import java.util.regex.Pattern;

public class Discover10Friendly {

	public static void main(String[] args) 
	{
		while (true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a value of N.");		// Telling you what to do.
			String n = scan.nextLine();								// Reading in what you want to scan
			String regexCheck = "[0-9]+";							// We only want input of pure digits, so that's the first step.
			Pattern p = Pattern.compile(regexCheck);
			if (!p.matcher(n).matches())
				System.out.println("[]\n");							// This will probably also change later.
			else
				System.out.println("These sure are numbers.\n");	// We will continue developing our solution from here.
		}
	}

}
