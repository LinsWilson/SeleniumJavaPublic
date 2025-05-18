import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalLogicAndLoopsAssignment {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		 * If else example
		 */
		byte byteDayOfWeek=6;

		if(byteDayOfWeek==1)
			System.out.println("Day "+byteDayOfWeek+" is Sunday");
		else if(byteDayOfWeek==2)
			System.out.println("Day "+byteDayOfWeek+" is Monday");
		else if(byteDayOfWeek==3)
			System.out.println("Day "+byteDayOfWeek+" is Tuesday");
		else if(byteDayOfWeek==4)
			System.out.println("Day "+byteDayOfWeek+" is Wednesday");
		else if(byteDayOfWeek==5)
			System.out.println("Day "+byteDayOfWeek+" is Thursday");
		else if(byteDayOfWeek==6)
			System.out.println("Day "+byteDayOfWeek+" is Friday");
		else if(byteDayOfWeek==7)
			System.out.println("Day "+byteDayOfWeek+" is Saturday");
		
		/*
		 * Switch case example
		 * 
		 */

		byte byteMonthOfYear=11;
		
		switch(byteMonthOfYear)
		{ 
		case 1:
			System.out.println("Month "+byteMonthOfYear+" is January");
			break;
		case 2:
			System.out.println("Month "+byteMonthOfYear+" is February");
			break;
		case 3:
			System.out.println("Month "+byteMonthOfYear+" is March");
			break;
		case 4:
			System.out.println("Month "+byteMonthOfYear+" is April");
			break;
		case 5:
			System.out.println("Month "+byteMonthOfYear+" is May");
			break;
		case 6:
			System.out.println("Month "+byteMonthOfYear+" is June");
			break;
		case 7:
			System.out.println("Month "+byteMonthOfYear+" is July");
			break;
		case 8:
			System.out.println("Month "+byteMonthOfYear+" is August");
			break;
		case 9:
			System.out.println("Month "+byteMonthOfYear+" is September");
			break;
		case 10:
			System.out.println("Month "+byteMonthOfYear+" is October");
			break;
		case 11:
			System.out.println("Month "+byteMonthOfYear+" is November");
			break;
		case 12:
			System.out.println("Month "+byteMonthOfYear+" is December");
			break;
		}
		
		/*
		 * for loop example
		 */
		System.out.println("Nines table in reverse");
		for(int i=10;i>0;i--) {
			System.out.println("9*"+i+"="+9*i);
		}
		
		/*
		 * While loop example
		 */
		System.out.println("All even numbers between 1 and 50");
		byte count=1;
		while(count<=50)
		{
			if(count%2==0)
				System.out.println(count);
			count++;
		}
		
		/*
		 * do while loop example
		 */
		System.out.println("*************************");
		byte validNumber=7;
		byte randomNumber=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.println("Enter the expected number between 1 and 10:");
			randomNumber=Byte.parseByte(reader.readLine());
			if(randomNumber<=10 && randomNumber>=1)
			{	
			
				if(randomNumber==validNumber)
					System.out.println(validNumber+" is the Correct number");
				else
					System.out.println("Wrong Try again");
				
			}
			else 
			{
				System.out.println("Console not available");
			}
			
		}
		while(randomNumber!=validNumber);
			
	}

}
