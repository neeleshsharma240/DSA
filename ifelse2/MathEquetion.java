import java.util.*;
public class MathEquetion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("1st_number +,-,/,* 2nd_number\nEx. 1 + 2 \nEnter Your Expression: ");
	int a = sc.nextInt();
	char c = sc.next().charAt(0);
	int b = sc.nextInt();
	
	switch(c){
	case '+' : System.out.print(a+" "+c+" "+b+" = "+(a+b));
		   break;
	case '-' : System.out.print(a+" "+c+" "+b+" = "+(a-b));
		   break;
	case '/' : System.out.print(a+" "+c+" "+b+" = "+(a/b));
		   break;
	case '*' : System.out.print(a+" "+c+" "+b+" = "+(a*b));
		   break;
	default : System.out.print("invalid Expression");
	}
    }
}