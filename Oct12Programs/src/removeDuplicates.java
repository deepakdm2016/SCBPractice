import java.util.Scanner;

public class removeDuplicates {

	public static void main(String[] args) {

		System.out.println("Please enter the string to remove the duplicates");
		Scanner s=new Scanner(System.in);
		String input=s.next();
		String output = "";
		for(int i=0;i<input.length();i++)
		{
			System.out.println(input.substring(i, i+1));
			if ((output.indexOf(input.substring(i, i+1))<0))
					{
						output+=input.substring(i, i+1);
					}
			
		}
		
		System.out.println(output);
	}

}
