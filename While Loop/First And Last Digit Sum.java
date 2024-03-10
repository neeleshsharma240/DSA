
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number: ");
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
		System.out.println("Sum Of first And Last Digit: "+(firstDigit+lastDigit));
	}
}
