import java.util.*;
public class Weather{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter degree: ");
	int d = sc.nextInt();
	
	if(d<0){
             System.out.println("Then freezing");
        }else if(d<10){
             System.out.println("Then very cold");
        }else if(d<20){
             System.out.println("Then cold");
        }else if(d<30){
             System.out.println("Yhen normal in temp");
        }else if(d<40){
 	     System.out.println("Then its hot");
        }else{
            System.out.println("Then its very hot");
       }
	
    }
}


