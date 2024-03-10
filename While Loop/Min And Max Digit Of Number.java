import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number: ");
	    int n = sc.nextInt();
	    int min = n%10;
	    int max = n%10;
	    
	    while(n>0){
	        int a= n%10;
	        if(a<min) min = a;
	        if(a>max) max = a;
	        n /= 10;
	    }
	
	    System.out.println("Min number is: "+min);
	    System.out.println("Max number is: "+max);
	}
}
