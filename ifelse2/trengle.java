import java.util.*;
public class trengle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a: ");
	int a = sc.nextInt();
	System.out.print("Enter b: ");
	int b = sc.nextInt();
	System.out.print("Enter c: ");
	int c = sc.nextInt();
	if(a==b){
	    if(a==c){
	        System.out.print("This is equilateral");
	    }else{
	        System.out.print("This is isosalis");
	    }
	}else{
	   if(b==c){
	        System.out.print("This is isosalis");
	    }else{
	        if(a==c){
	            System.out.print("This is isosalis");
	        }else{
	             System.out.print("This isscalen");
	        }
	    }
	}
	
    }
}


