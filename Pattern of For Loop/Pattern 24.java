
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Star: ");
	    
	    int n =sc.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(j==1||j==n||(i==j&&i<=n/2+1)||(i==n+1-j&&j>n/2)){
		             System.out.print(" *");
	             } else{
		          System.out.print("  ");
	            }
	        }
		    System.out.println("");
	    }
	}
}

