import java.util.Scanner;
class Table{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     for(int i=1;i<=b;i=i+2){
         System.out.println(a+" x "+i+" = "+a*i);
     }
     sc.close();
        
    }
}