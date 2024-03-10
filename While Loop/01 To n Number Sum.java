
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int ans = 0;
	    int a = 1;
	   
	    while(a<=n){
	      ans= a+ans;
	      a++;
	    }
	   
	    System.out.println("01 to "+n+" sum = "+ans);
	   
	}
}
