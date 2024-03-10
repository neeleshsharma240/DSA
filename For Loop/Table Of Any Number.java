
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Which table do you Want: ");
	    int t = sc.nextInt();
	    
	   
	    for(int n = 1; n<=10 ; n++){
             System.out.println(t+" * "+n+" = "+t*n);   
       }
	    
	}
}
