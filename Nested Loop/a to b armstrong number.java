import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 1st Number: " );
	    int x = sc.nextInt();
	    System.out.print("Enter 2nd Number: " );
	    int y = sc.nextInt();
	    
	    for( ; x<=y;x++){
	        int r = x;
	        int ans = 0;
	        int count = 0;
	    
	        for(;r>0; r /= 10){
	            count++;
	        }
	        r=x;
	        
	        for(;r>0; r /= 10){
	            int a= r%10;
	            ans +=(int) Math.pow(a, count);
	        }
	        
	        if(x == ans) System.out.println(x);
	    }
	}
}
