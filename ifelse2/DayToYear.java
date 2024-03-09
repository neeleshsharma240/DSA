import java.util.*;
public class DayToYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number Of Day: ");
	int a = sc.nextInt();

	    if(a>=365){
		int n = a/365;
	        a = a%365;
	        System.out.println("Number of Years: "+n);  
            }

	   if(a>=30){
		int n = a/30;
	        a = a%30;
	        System.out.println("Number of Months: "+n);  
            }
	    
	    if(a>=7){
		int n = a/7;
	        a = a%7;
	        System.out.println("Number of  Weeks: "+n);  
            }

	    if(a>=1){
	        System.out.println("Number of Days: "+a);  
            }
	
    }
}


