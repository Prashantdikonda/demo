package Tasks;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		
		int a = 565, revVal = 0, remainder, temp;
	      temp = a;
	      System.out.println("Number to be checked = "+a);
	      while( a > 0 ) {
	         remainder = a % 10;
	         revVal = revVal * 10 + remainder;
	         a =a/10;
	      }
	      if (temp == revVal)
	         System.out.println("Number is Palindrome..!");
	      else
	         System.out.println("Not a palindrome!");

	}

}
