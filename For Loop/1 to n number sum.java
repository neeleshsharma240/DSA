
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int ans = 0;
	   
	    for(int a=1 ; n>=a ; a++){
	         ans= a+ans;
	    }
	    System.out.println("01 to "+n+" Sum = "+ans);
	}
}
