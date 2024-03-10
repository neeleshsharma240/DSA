
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter  Number: ");
	    int n = sc.nextInt();
	     int flag = 0;
	    for(int i=1;  ; i++){
	        if(i*i == n) {
	            System.out.println("this is perfect square of "+i+" = "+n);
	            flag++; 
	        break;
	        }
	   }
	    if(flag ==0) System.out.println("this is not perfect square");
	     
	}
}
