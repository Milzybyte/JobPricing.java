import java.util.Scanner;
public class JobPricing
{
	public static void main(String[] args)
	{
		//vars and constants
		final double J_HOUR = 35;
		double hWork;
		final double D_HOUR = 12;
		double tDrive;
	
		Scanner keyboard = new Scanner(System.in);
		
		//input phase
		System.out.print("How many hours of work was done? >> ");
		hWork = keyboard.nextDouble();
		
		System.out.print("How many hours driving? >> ");
		tDrive = keyboard.nextDouble();
		
		//output phase
		System.out.print(hWork * J_HOUR + tDrive * D_HOUR);  
	}

}