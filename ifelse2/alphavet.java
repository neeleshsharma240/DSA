import java.util.*;
public class alphavet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Character: ");
	char c = sc.next().charAt(0);
	if(c>='65' && c<='z' )

	/* if(c=='a' || c=='b' || c=='c' || c=='d' || c=='e' || c=='f' || c=='g' || c=='h' || c=='i' || c=='j' || c=='k' || c=='l' || c=='m' || c=='n' || c=='o' 	|| c=='p' || c=='q' || c=='r' || c=='s' || c=='t' || c=='u' || c=='v' || c=='x' || c=='y' || c=='z' ) */
	
	{
	    System.out.print("Lower case");
	}else{
	    System.out.print("Upper case");
	}
    }
}