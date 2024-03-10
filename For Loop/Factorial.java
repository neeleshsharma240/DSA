
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int ans = 1;
	   
	    
	    for(int a=1 ; a<=n ; a++){
	         ans *= a;
	    }
	    System.out.println("Factorial Of "+n+" is: "+ans);
	}
}
