import java.util.*;
public class NumberSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number: ");

	int n = sc.nextInt();
	int a = n%10;
	n /= 10;
	int b = n%10;
	n /= 10;
	int c = n%10;
	n /= 10;
	int d = n%10;
	n /= 10;
	System.out.print(a+b+c+d);
	

    }
}