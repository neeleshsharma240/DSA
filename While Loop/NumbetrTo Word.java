import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int ans=0;
	    while(a>0){
	     
	        int r=a%10;
	        ans=ans*10+r;
	        a /=10;
	    }
	    a=ans;
	    
	    while(a>0){
	        int r=a%10;
	        switch(r){
	            case 0:System.out.print("zero ");
	                   break;
	            case 1:System.out.print("one ");
	                   break;
	            case 2:System.out.print("two ");
	                   break;
	            case 3:System.out.print("three ");
	                   break;
	             case 4:System.out.print("four ");
	                   break; 
	             case 5:System.out.print("five ");
	                   break; 
	             case 6:System.out.print("six ");
	                   break; 
	              case 7:System.out.print("seven ");
	                   break;
	              case 8:System.out.print("eight ");
	                   break;
	              case 9:System.out.print("nine ");
	                   break;} 
	              a=a/10;
	        
	    }
	    
	        
	    
		
	}
}