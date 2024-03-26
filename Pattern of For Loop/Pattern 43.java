
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Number Of Star: ");
	    int n =sc.nextInt();
	    int space = n*2-3;
	    int star = 1;
	    for(int i=1;i<=n*2-1;i++){
	        
	        for(int j=1;j<=star;j++){
	            if(j==1||j==star){
	                System.out.print(" *");
	            }else{
	                System.out.print("  "); 
	            }    
	        }
	        for(int j=1;j<=space;j++){
	            System.out.print("  ");
	        }
	       for(int j=1;j<=star&&j!=n;j++){
		         if(j==1&&i!=n||j==star||i==n&&j==star-1){
	                System.out.print(" *");
	            }else{
	                System.out.print("  "); 
	            }   
	       }
	       if(i<n){
	            star++;
	            space-=2;
	       }else{
	           star--;
	           space+=2;
	       }
	       System.out.println();
	    }
	}
}


	      