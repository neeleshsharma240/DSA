
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Number Of Star: ");
	
	    int star = 1;
	    int n =sc.nextInt();
	    for(int i=1;i<=n*2-1;i++){
	        for(int j=1;j<=star;j++){
	             if(j==star||j==1){
	                 System.out.print(" *"); 
	             }
	             else{
	                 System.out.print("  "); 
	             }
	        }
	        if(i<n){
	            star++;
	        }else{
	            star--;
	        }
	        System.out.println();
	    }
	}
}


	      