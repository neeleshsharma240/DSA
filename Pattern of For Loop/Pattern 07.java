import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Star: ");
	    
	    int n =sc.nextInt();
	    int space = 0;
	    int star = n;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=space;j++){
	           System.out.print("  ");
	        }
	        for(int k=1;k<=star;k++){
	           System.out.print("* ");
	        }
	        
		    System.out.println();
		    space++;
		    star--;
	    }
	}
}
