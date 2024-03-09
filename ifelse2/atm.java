import java.util.*;
public class atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter amount: ");
	int a = sc.nextInt();
	
	if(a%100==0){

	    if(a>=2000){
		int n = a/2000;
	        a %= 2000;
	        System.out.println("Number of 2000 notes: "+n);  
            }

	   if(a>=500){
		int n = a/500;
	        a = a%500;
	        System.out.println("Number of 500 notes: "+n);  
            }
	    
	    if(a>=200){
		int n = a/200;
	        a = a%200;
	        System.out.println("Number of 200 notes: "+n);  
            }

	    if(a>=100){
		int n = a/100;
	        a = a%100;
	        System.out.println("Number of 100 notes: "+n);  
            }
	     
	}else{
	    System.out.print("Please enter amount in muliple of 100");
        }
	
    }
}


