
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter first Number: ");
	    int a = sc.nextInt();
	    System.out.print("Enter second Number: ");
	    int b = sc.nextInt();
	 
	    for(; a<=b ; a++){
             if(a%6==0){
              System.out.println("divisible of 6: "+a);   
             }
	    }
	    
	}
}
