import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Number Of Star: ");
	    
	    int n =sc.nextInt();
	    int space= n-1;
	    int star = 1;
	    for(int i=1;i<n*2;i++){
	        for(int j=1;j<=space;j++){
	           System.out.print("  ");
	        }
	        for(int k=1;k<=star;k++){
	            if(k==1||k==star){
	               System.out.print(" *"); 
	            }else{
	               System.out.print("  "); 
	            }
	        }
	        if(i<n){
	           star +=2;
	           space--;
	            
	        }else{
	           star-=2;
	           space++;
	       }
		   System.out.println();
	       
	    }
	}
}
