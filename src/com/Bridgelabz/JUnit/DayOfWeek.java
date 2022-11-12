package com.Bridgelabz.JUnit;

public class DayOfWeek {
	
	public static void main(String[] args) {
		int weekday = dayOfWeek(3, 11, 1995);
		 switch (weekday)    
         {    
             case 0:    
                 System.out.println("Day of the week is Sunday");    
                 break;    
             case 1:    
                 System.out.println("Day of the week is Monday");    
                 break;    
             case 2:    
                 System.out.println("Day of the week is Tuesday");    
                 break;         
             case 3:    
                 System.out.println("Day of the week is Wednesday");    
                 break;    
             case 4:    
                 System.out.println("Day of the week is Thursday");    
                 break;    
             case 5:    
                 System.out.println("Day of the week is Friday");    
                 break;    
             case 6:    
                 System.out.println("Day of the week is Saturday");    
                 break;    
         }    
		
	}
	
	 static int dayOfWeek(int day, int month, int year){
	        int y = year-(14-month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14-month)/12) - 2;
	        return (day + x + 31*m/ 12) % 7;
	 }
}
