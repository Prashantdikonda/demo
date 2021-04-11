package Tasks;
import java.util.Scanner;
public class EvenOdd 
{

	public static void main(String[] args) 
	{
		int no;
		System.out.println("Enter an interger number = ");
		Scanner s = new Scanner(System.in);
		no=s.nextInt();
		
		if(no%2==0)
			System.out.println(no+" " + "is an even number");
		else
			System.out.println(no+" " + "is an odd number");

	}

}
