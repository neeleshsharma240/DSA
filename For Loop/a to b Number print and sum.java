
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter first Number: ");
	    int a = sc.nextInt();
	    System.out.print("Enter second Number: ");
	    int b = sc.nextInt();
	    int ans = 0;
	   
	    for(; a<=b ; a++){
	       System.out.println(a);  
	         ans= a+ans;
	    }
	    System.out.println("sum is: "+ans);
	}
}
