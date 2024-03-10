import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter any mumber: ");
	    int a=sc.nextInt();
	    int flag=0;
	    
	    for(int i=1;i<=a;i++){
	        if(a%i==0) flag++;
	    }
	    
	    if(flag==2){
	        System.out.print("it is prime nuimber");
	    }else{
	        System.out.print("it is not prime nuimber");
	    }
    }		
 }