package Lab1part2;

import java.util.Scanner;
public class Deliverable {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int userDayOne;
	int userDayTwo;
	int userDayTotal;
	int userMonthOne;
	int userMonthTwo;
	int userMonthTotal;
	int userYearOne;
	int userYearTwo;
	int userYearTotal;
	
	userYearTotal = 0;
	userMonthTotal = 0;
	userDayTotal = 0;
	
	
	System.out.println ("Hello please enter two different years in (YYYY) format e.g (2005)."); 
	userYearOne = scan.nextInt();  // user entry 
	userYearTwo = scan.nextInt();
	if (userYearOne <= 0 ) {
		System.out.println ("Invalid Entry Enter Number Greater Than Zero"); // validates the entry isn't a negative number or 0
	}
	else if (userYearTwo <= 0) {
		System.out.println ("Invalid Entry Enter Number Greater Than Zero");
	}
	else if (userYearOne < userYearTwo) {
	userYearTotal =	userYearTwo - userYearOne;
	}
	else if (userYearTwo < userYearOne) {
		userYearTotal = userYearOne - userYearTwo;
	}
		
	
	System.out.println ("Enter two different months in (MM) format e.g (09).");
	userMonthOne = scan.nextInt();
	userMonthTwo = scan.nextInt();
	if (userMonthOne <= 0) {
		System.out.println ("Invalid Entry Enter Number Greater Than Zero");
	}
	else if (userMonthTwo <=0) {
		System.out.println ("Invalid Entry Enter Number Greater Than Zero");
	}
	else if (userMonthOne < userMonthTwo) {     // this makes sure the number can be subtracted without having a negative integer 
			userMonthTotal = userMonthTwo - userMonthOne;
	}
		else if (userMonthTwo< userMonthOne) {
			userMonthTotal = userMonthOne - userMonthTwo;
		}
		System.out.println("Enter two different days in (DD) format.");
		userDayOne = scan.nextInt();
		userDayTwo = scan.nextInt();
	
		
		 if (userDayOne <= 0) {
			System.out.print("Invalid Entry Enter Number Greater Than Zero");
		}
		 else if (userDayTwo <= 0) {
			 System.out.print("Invalid Entry Enter Number Greater Than Zero");
		 }
		else if (userDayOne < userDayTwo) {
			userDayTotal = userDayTwo - userDayOne;
		}
		else if (userDayTwo< userDayOne) {
			userDayTotal = userDayOne - userDayTwo;
		}
		System.out.print("There is " );
		 if (userYearTotal > 1) {
		 System.out.print( userYearTotal + " Years "); // this makes the string either singular or plural if the integer is more than 1
		 }
		else {
			System.out.print(userYearTotal + " Year ");
		}
		 if (userMonthTotal > 1) {
			 System.out.print(userMonthTotal + " Months ");
			 
		}
		 else {
			 System.out.print (userMonthTotal + " Month ");
		 }
		if (userDayTotal > 1) {
			System.out.print (userDayTotal + " Days ");
		}
		else {
			System.out.print(userDayTotal + " Day ");
		}
		System.out.print("difference between those two dates.");
			
		
	}
	
}	
		

	
	

	
	

