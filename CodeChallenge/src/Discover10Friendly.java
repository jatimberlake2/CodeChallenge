import java.util.Scanner;
import java.util.regex.Pattern;

public class Discover10Friendly {

	public static void main(String[] args) 
	{
		while (true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a value of N.");
			String n = scan.nextLine();
			String regexCheck = "[0-9]+";
			Pattern p = Pattern.compile(regexCheck);
			if (!p.matcher(n).matches())
				System.out.println("[]\n");
			else
				System.out.println("These sure are numbers.\n");
		}
	}

}
