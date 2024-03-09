import java.util.*;
public class Vobil{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Character: ");
	char c = sc.next().charAt(0);
	if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
	    System.out.print("vowel");
	}else{
	    System.out.print("Consonants");
	}
    }
}