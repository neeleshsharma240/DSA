import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int even = 0;
	    int odd = 0;
	    while(n>0){
	        int a= n%10;
	        if(a%2==0){
	            even +=a;
	            
	        }else{
	            odd += a;
	        }
	        
	        n /= 10;
	    }
		System.out.println("even sum "+even+"\nodd sum "+odd);
	}
}
