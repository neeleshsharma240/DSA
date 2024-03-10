import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fibonacci serise numbner");
        int a=sc.nextInt();
        int f=0;
        int s=1;
        for(int i=1;i<=a;i++){
            if(i==1){
                System.out.println(f);
            }else if(i==2){
                 System.out.println(s);
            }else {
                int c=f+s;
                 System.out.println(c);
                 f=s;
                 s=c;
            }
        }
    }
}