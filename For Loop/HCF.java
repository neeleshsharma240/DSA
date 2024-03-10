import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Firest Numbner: ");
	    int a=sc.nextInt();
	    System.out.print("Enter Second Numbner: ");
	    int b=sc.nextInt();
	    int ans=1;
	    for(int i=1;i<=a&&i<=b;i++){
	        if(a%i==0&&b%i==0){
	            ans=i;
	            
	        }
	    }
	    System.out.println(a+" and "+b+" HCF is = "+ans);
	   
	}
}