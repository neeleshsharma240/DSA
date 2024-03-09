import java.util.*;
public class Time{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Hours: ");
	int h = sc.nextInt(); 
        System.out.print("Enter minutes: ");
	int m = sc.nextInt(); 
	
	if(h<12){
	System.out.println(h+":"+m+" am");
	}else{
	    if(h>12){
	    int p = h-12;
	    System.out.println(p+":"+m+" pm");
	    }
            else{
	    System.out.println(h+":"+m+" pm");
            }
	}
    }
}