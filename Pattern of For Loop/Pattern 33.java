
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Number Of Star: ");
	    int n =sc.nextInt();
	    int space = 0;
	    int star = n*2-1;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=space;j++){
	            System.out.print("  ");
	        }
	        for(int j=1;j<=star;j++){
		       System.out.print(" *");   
	        }
	        star-=2;
	        space++;
	       System.out.println();
	    }
	}
}


	      