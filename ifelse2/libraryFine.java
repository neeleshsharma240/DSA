import java.util.*;
public class libraryFine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("How many day book Returnen Day: ");
	int d = sc.nextInt();
	if(d>3){
	    if(d>10){
	        if(d>30){
		    System.out.print("Membership Cancelled");
		}else{
		    System.out.print("50 rs Fine");
		}
	    }else{
	        System.out.print("20 rs Fine");
	    }
	}else{
	    System.out.print("10 rs Fine");
	}
    }
}
