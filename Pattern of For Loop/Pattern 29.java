import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Star: ");
	    
	    int n =sc.nextInt();
	    int a = 1;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n-i;j++){
	           System.out.print(" ");
	        }
	        for(int k=1;k<=a;k++){
	            if(i==n/2+1||k==1||k==a){
	                
	                System.out.print("* ");
	            }else{
	                System.out.print("  ");
	            }
	        }
	        for(int j=1;j<=n-i;j++){
	            System.out.print(" ");
	        }
		    System.out.println();
	        a++;
	        
	    }
	}
}
