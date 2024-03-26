import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Star: ");
	    int num=1;
	    int n =sc.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	           System.out.print(num+" ");
	           num++;
	        }
		        System.out.println();
	    }
	}
}
