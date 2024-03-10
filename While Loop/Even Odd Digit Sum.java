import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Number: ");
	    int n = sc.nextInt();
	    int evenSum = 0;
	    int oddSum = 0;
	    while(n>0){
	        int a= n%10;
	        if(a%2==0) evenSum +=a;
	        else oddSum +=a;
	        n /= 10;
	    }
		System.out.println("sum is even Number: "+evenSum+"\nsum is odd Number: "+oddSum);
	}
}
