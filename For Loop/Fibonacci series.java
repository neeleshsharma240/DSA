
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter  Number: ");
	    int n = sc.nextInt();
	    int ft = 0;
	    int st = 1;
	    for(int i =1;i<=n;i++){
	        int tt = ft +st;
	        System.out.println(i+" - "+ft);
	        ft=st;
	        st=tt;
	    }
	}
}