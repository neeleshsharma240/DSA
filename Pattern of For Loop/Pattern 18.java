import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Star: ");
	    int n =sc.nextInt();
	    for(int i=1;i<=n;i++){
	        int dro =i;
	        int dec = n-1;
	        for(int j=1;j<=i;j++){
	           System.out.print(dro+" ");
	           dro+=dec;
	           dec--;
	           
	        }
		    System.out.println();
	    }
	}
}