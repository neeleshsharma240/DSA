import java.util.*;
public class weekname{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter week Number: ");
	int w = sc.nextInt();
	
        if(w==1){
	    System.out.println("Day is Mon");
	}else if(w==2){
	    System.out.println("Day is Tue");
	}else if(w==3){
	    System.out.println("Day is Wed");
	}else if(w==4){
	    System.out.println("Day is Thu");
	}else if(w==5){
	    System.out.println("Day is Fri");
	}else if(w==6){
	    System.out.println("Day is Sat");
	}else if(w==7){
	    System.out.println("Day is Sun");
	}else{
	    System.out.println("Invalid day");
	}
    }
}