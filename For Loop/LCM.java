import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter First Number: ");
	    int a=sc.nextInt();
	    System.out.print("Enter Second Number: ");
	    int b=sc.nextInt();
	    for(int i=1;i<=a*b;i++){
	        if(i%a==0&&i%b==0){
	            System.out.println(a+" and "+b+" LCM is = "+i);
	            break;
	        }
	        
	    }
		
	}
}