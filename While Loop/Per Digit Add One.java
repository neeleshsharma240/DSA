
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int ans = 0;
	    int a = 1;
	   
	    while(n>0){
	       int r = n%10;
	       
	       if(r==9) r=0;
	       else r++;
	       
	       ans = (r*a)+ans;
	       n /=10;
	       a *=10;
	    }
	    System.out.println("Per Digit One Add = "+ans);
	}
}
