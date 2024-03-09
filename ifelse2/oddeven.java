
import java.util.*;
public class oddeven
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter first Number: ");
	    int n = sc.nextInt();
	    
	    int positive = 0, zero = 0, nagetive = 0,  even = 0, odd = 0;
	    for(int i=1; i<=n ; i++){

	        int a = sc.nextInt();
		if(a>0){
		    positive++;

		    if(a%2==0){
			even++;
		    }else{
		        odd++;
		    }

		}else if(a==0){
		    zero++;
		    even++;
		}else{
		    nagetive++;

		     if(a%2==0){
			even++;
		    }else{
		        odd++;
		    }

		}
	        
	    }
	    System.out.println("Nagetive Number is: "+nagetive);
	    System.out.println("Zero Number is: "+zero);	   
            System.out.println("Positive Number is: "+positive);
	    System.out.println("Even Number is: "+even);
	    System.out.println("Odd Number is: "+odd);
	}
}
