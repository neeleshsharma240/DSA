
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Number Of Star: ");
	    int n =sc.nextInt();
	   
	    int star = n;
	    for(int i=1;i<=n*2-1;i++){
	        for(int j=1;j<=star;j++){
	            System.out.print(" *");   
	        }
	       if(i<n){
	          star--; 
	       }else{
	          star++;
	       }
	       System.out.println("");
	    }
	}
}


	      