import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Number" );
	    int n = sc.nextInt();
	    int r = n;
	    int ans = 0;
	    int count = 0;
	    
	     while(r>0){
	        count++;
	        r /= 10;
	    }
	    r=n;
	    while(r>0){
	        int a= r%10;
	     ans +=(int) Math.pow(a, count);
	        r /= 10;
	    }
	   
	    if(n == ans) System.out.println("this is armstrong number");
		else  System.out.println("this is not armstrong number");
	}
}
