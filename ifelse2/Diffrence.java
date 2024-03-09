import java.util.*;
public class Diffrence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
	if(a>b){
	    System.out.println("Diffrence of "+a+" and "+b+" = "+(a-b));
	}else{
	  System.out.println("Diffrence of "+a+" and "+b+" = "+(b-a));  
	}
        
    }
}