import java.util.Scanner;
public class Zeller
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Month: ");
		int month = keyboard.nextInt();
		System.out.print("Day:   ");
		int day = keyboard.nextInt();
		System.out.print("Year:  ");
		int year = keyboard.nextInt();
		
			if (month < 3)
				{
				month = month + 12;
				year = year - 1;
				}
		int computation = day + (26 * (month +1)) / 10 + year + year / 4 + 6 * (year / 100) + year / 400;
		int dayOfWeek = computation % 7;//0-6 for Saturday - Friday
		
			if (dayOfWeek == 0){System.out.println("Saturday");}
			if (dayOfWeek == 1){System.out.println("Sunday");}
			if (dayOfWeek == 2){System.out.println("Monday");}
			if (dayOfWeek == 3){System.out.println("Tuesday");}
			if (dayOfWeek == 4){System.out.println("Wednesday");}
			if (dayOfWeek == 5){System.out.println("Thursday");}
			if (dayOfWeek == 6){System.out.println("Friday");}
		
	}//end main
	
}//end Zeller