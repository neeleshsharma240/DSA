import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
	    
	    int n =sc.nextInt();
	    int a1 =1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==n/3+1 ||i==(n*2)/3+1 ||j==n/3+1 ||j==(n*2)/3+1){
		             System.out.print(" *");
	             } else if(i==n/4&&j==n/4){
	               System.out.print(" "+a1); 
	            }else if(i==n/4&&j==n/2+1){
	                
	                 System.out.print(" "+a2);
	            }else if(i==n/4&&j==n-n/5){
	                
	                 System.out.print(" "+a3);
	            }else if(i==n/2+1&&j==n/4){
	                
	                 System.out.print(" "+a4);
	            }else if(i==n/2+1&&j==n/2+1){
	                
	                 System.out.print(" "+a5);
	            }else if(i==n/2+1&&j==n-n/5){
	                
	                 System.out.print(" "+a6);
	            }else if(i==n-n/5&&j==n/4){
	                
	                 System.out.print(" "+a7);
	            }else if(i==n-n/5&&j==n/2+1){
	                
	                 System.out.print(" "+a8);
	            }else if(i==n-n/5&&j==n-n/5){
	                
	                 System.out.print(" "+a9);
	            }else{
		          System.out.print("  ");
	            }
	           
	        }
		    System.out.println();
	    }
	}
}
