import java.util.Scanner;
class Capacity{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a;
        String str=sc.next();
        a=str.charAt(0);
        System.out.println((int)a);
        sc.close();
    }
}