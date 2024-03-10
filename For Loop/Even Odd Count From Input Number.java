
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int n = sc.nextInt();
	    int evenCount = 0;
	    int oddCount = 0;
	   
	    for(int i=1 ; i<=n ; i++){
	        System.out.print("enter other Number: ");
	        int a = sc.nextInt();
	        if(a%2==0){
	            evenCount++;
	        }
	        else{
	            oddCount++;
	        }
	         
	    }
	    System.out.println("Conut Of Even is: "+evenCount+"\nConut Of odd is: "+oddCount);
	  
	}
}
