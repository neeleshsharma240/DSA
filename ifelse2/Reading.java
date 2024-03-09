import java.util.*;
public class Reading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Meter Reading: ");
	int r = sc.nextInt();
	
	if(r<=100){
             System.out.println((r*4)*1.1);
        }else if(r<=200){
             System.out.println((((r-100)*6)+400)*1.1);
        }else if(r<=300){
             System.out.println((((r-200)*7)+1000)*1.1);
        }else if(r<=400){
             System.out.println((((r-300)*8)+1700)*1.1);
        }else if(r<=500){
 	     System.out.println((((r-400)*10)+2500)*1.1);
        }else{
            System.out.println((((r-500)*12)+3700)*1.1);
       }
	
    }
}


