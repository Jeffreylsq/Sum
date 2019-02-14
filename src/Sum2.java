
import java.util.Scanner;
public class Sum2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Which number your want to know");
		int index = kb.nextInt() - 1;

		int num = factor(index);
		System.out.println(num);

	}

	public static int factor(int n)
	{
		int num = 1;
		if(n <= 1 )
		{
			return num;
		}
		else 
		{
			return (factor(n-2) + factor(n - 1)); 	 
		}

	}

}
