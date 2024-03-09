import java.util.*;
public class evenodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("How many people come in the party: ");
	int n = sc.nextInt();
	if(( n&1 ) == 0){
	    System.out.println("Completly all pair");
	}else{
	    System.out.println("Not completly all pair");
	}
    }
}