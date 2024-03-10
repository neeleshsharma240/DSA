
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int a = n;
	    int count = 0;
	    while(a>0){
	        count++;
	        a /=10;
	    }
	    
	    int power =(int) (Math.pow(10, count-1));
	    int firstDigit = n / power;
	    int lastDigit = n%10;
	    int c = n%power;
	    c = c/10;
	    int ans = (lastDigit*power)+(c*10)+firstDigit;
		System.out.println("First and last digit change: "+ans);
	
	}
}
