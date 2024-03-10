import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int evenDigit = 0;
	    int oddDigit = 0;
	    while(n>0){
	        int a= n%10;
	        if(a%2==0){
	            evenDigit++;
	            
	        }else{
	            oddDigit++ ;
	        }
	        
	        n /= 10;
	    }
		System.out.println("evenDigit Number: "+evenDigit+"\noddDigit Number: "+oddDigit);
	}
}
