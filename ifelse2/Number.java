import java.util.*;
public class Number
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	if(n>0){
	    System.out.println("possitive");
	}
	else{
	    if(n<0){
	        System.out.println("negetive");
	    }
	    else{
	        System.out.println("number is zero")
	    }
	}
    }
}