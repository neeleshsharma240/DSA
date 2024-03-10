import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Number: ");
	    int a=sc.nextInt();
	    int ans =0;
	    for(int i=1;i<a;i++){
	        if(a%i==0){
	            ans = ans +i;
	        }
	        
	    }
	    if(a==ans) System.out.println("this is  parfect numbner");
		else System.out.println("this is not parfect numbner");
	}
}