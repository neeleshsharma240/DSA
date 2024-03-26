import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter 1 Number: ");
	    int a=sc.nextInt();
	    System.out.print("Enter 2 Number: ");
	    int b=sc.nextInt();
	    
	    for(;a<=b;a++){
	        int ans =0;
	        for(int i=1;i<a;i++){
	        if(a%i==0){
	            ans = ans +i;
	        }
	        
	        }
	        if(a==ans) System.out.println(a);
	     	
	    }
	}
}