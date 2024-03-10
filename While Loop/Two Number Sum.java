import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter First Number: ");
	    int a = sc.nextInt(); 
	    System.out.print("Enter Second Number: ");
	    int b = sc.nextInt(); 
	    int p = 1;
	    int n = 0;
	    int c = 0;
	    while(a>0){
	        int x = a%10;
	        int y = b%10;
	        int z = x+y+c;
	        n=(z%10)*p+n;
	        c= z/10;
	        a /=10;
	        b /=10;
	        p *=10;
	    }
	    n = (b+c)*p+n;
	    System.out.print(n);
	
	   
	}
}
