import java.util.*;
public class TrianglePossible{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a: ");
	int a = sc.nextInt();
	System.out.print("Enter b: ");
	int b = sc.nextInt();
	System.out.print("Enter c: ");
	int c = sc.nextInt();
	if((a+b)>c){
	    if((a+c)>b){
	        if((b+c)>a){
	           System.out.println("Triangle is possible");
	        }else{
	           System.out.println("Triangle is not possible");
	        }   
	    }else{
	        System.out.println("Triangle is not possible"); 
	    }
	}else{
	    System.out.println("Triangle is not possible");   
	}
	
    }
}


