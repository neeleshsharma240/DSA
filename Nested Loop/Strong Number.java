
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int b = n;
	    int ans = 1;
	    int sum = 0;
	   
	    for( ;n>0; n /=10){
	        int x = n%10;
	    
	         for(int a=1 ; a<=x ; a++){
	              ans *= a;
	         }
	         
	         sum +=ans;
	         ans = 1;
    	}
    	if(b==sum) System.out.println("this is strong number ");
	    else System.out.println("this is not strong number ");
	}
}
