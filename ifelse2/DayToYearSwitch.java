import java.util.*;
public class DayToYearSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number Of Day: ");
	int a = sc.nextInt();
	
	switch(a){
	case 1 : System.out.print("Mon");
	break;
	case 2 : System.out.print("Tue");
	break;
	case 3 : System.out.print("Wed");
	break;
	case 4 : System.out.print("Thu");
	break;
	case 5 : System.out.print("Fri");
	break;
	case 6 : System.out.print("Sat");
	break;
	case 7 : System.out.print("Sun");
	break;
	default : System.out.print("invalid");
	}
    }
}