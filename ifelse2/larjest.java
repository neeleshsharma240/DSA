import java.util.*;
public class larjest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	System.out.print("Enter b number: ");
	int b = sc.nextInt();
	System.out.print("Enter c number: ");
	int c = sc.nextInt();
	if(a>b){
	    if(a>c){
	        System.out.print("a is greater");
	    }else{
	        System.out.print("c is greater");
	    }
	}else{
	    if(b>c){
	        System.out.print("b is greater");
	    }else{
	        System.out.print("c is greater");
	    }
	}
	
    }
}