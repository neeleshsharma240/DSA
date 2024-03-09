import java.util.*;
public class Profit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("cp ");
        int cp = sc.nextInt();
        System.out.print("sp ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit = "+(sp-cp)+"rs");
            // System.out.println(sp-cp+"rs");
        }else{
            System.out.print("loss = "+(cp-sp)+"rs");
            // System.out.println(cp-sp+"rs");
       }
   }
}

