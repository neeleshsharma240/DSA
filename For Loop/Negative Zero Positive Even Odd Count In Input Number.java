
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter  Number: ");
	    int n = sc.nextInt();
	    
	    int positive = 0, zero = 0, nagetive = 0,  even = 0, odd = 0;
	    for(int i=1; i<=n ; i++){
            System.out.print("Enter "+i+" Number: ");
	        int a = sc.nextInt();
	  
	    	if(a>0){
		        positive++;
		    }else if(a==0){
		        zero++;
		    }else{
		        nagetive++;
	   	   }
	   	   
	   	    if(a%2==0){
		    	even++;
		    }else{
		        odd++;
		    }
	        
	    }
	    System.out.println("Nagetive Number is: "+nagetive+"\nZero Number is: "+zero+"\nPositive Number is: "+positive);
	    System.out.println("Even Number is: "+even+"\nOdd Number is: "+odd);
	}
}
