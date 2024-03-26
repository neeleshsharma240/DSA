import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter A Number: ");
	    int a=sc.nextInt();
	    for(int i=2;i<=a;i++){
	        if(a%i==0){
	            int count = 0;
	            for(int b=2;b<i;b++){
	                if(i%b==0) {
	                    count=1;
	                    break;
	                }
	            }
	            if(count==0){
	            System.out.println(i);
	            }
	        }
	        
	    }
		
	}
}