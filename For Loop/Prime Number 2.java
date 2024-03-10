import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter any mumber: ");
	    int a=sc.nextInt();
	    int flag=0;
	    int x = (int)Math.sqrt(a);
	    for(int i=2;i<x;i++){
	        if(a%i==0){
            flag = 1;
            break;
            }
	    }
	    
	    if(flag==0 && a != 1){
	        System.out.print("it is prime nuimber");
	    }else{
	        System.out.print("it is not prime nuimber");
	    }
    }		
 }