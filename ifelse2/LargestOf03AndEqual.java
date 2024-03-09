import java.util.*;
public class LargestOf03AndEqual{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	System.out.print("Enter b number: ");
	int b = sc.nextInt();
	System.out.print("Enter c number: ");
	int c = sc.nextInt();
	if(a>b && b>c){
	    System.out.print("a is greater");
	} else if ((b>c) && (c>a)) {
           System.out.print("b is greater");
	}else if(a==b && a==c){
	   System.out.print("All are equal");
	}else if(a==b){
	    if(a>c){
	         System.out.print("a,b are equal and c is small ");
	    }else{
	        System.out.print("a,b are equal and c is greater ");
	    }
	}else if(a==c){
	    if(a>b){
	         System.out.print("a,c are equal and b is small ");
	    }else{
	        System.out.print("a,c are equal and b is greater ");
	    }
	}else if(b==c){
	    if(b>a){
	         System.out.print("b,c are equal and a is small ");
	    }else{
	        System.out.print("b,c are equal and a is greater ");
	    }
	}	
	
    }
}



 