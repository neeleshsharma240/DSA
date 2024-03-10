
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int evensum = 0;
	    int oddsum = 0;
	   
	    for(int i=1 ; i<=n ; i++){
	        System.out.print("enter other Number: ");
	        int a = sc.nextInt();
	        if(a%2==0){
	            evensum +=a;
	        }
	        else{
	            oddsum +=a;
	        }
	         
	    }
	    System.out.println("evensum is: "+evensum+"\noddsum is: "+oddsum);
	  
	}
}
