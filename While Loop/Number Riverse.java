import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number: ");
	    int n = sc.nextInt();
	    int ans = 0;
	    
	    while(n>0){
	        int a= n%10;
	        ans= ans*10+a;
	        n /= 10;
	    }
	    n = ans;
		System.out.println("Number Riverse: "+n);
	}
}
