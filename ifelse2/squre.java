import java.util.*;
public class squre
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a length: ");
	int l = sc.nextInt();
	System.out.print("Enter a wirdh: ");
	int w = sc.nextInt();
	if(l == w){
	    System.out.println("This is a squre");
	}
	else{
	   System.out.println("This is arightangle"); 
	}
    }
}