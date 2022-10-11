import java.util.Scanner;
class Sum{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sw=0;
        for(int i=0;i<a;i++){
            sw+=sc.nextInt();
        }
        System.out.print(sw);
    }
}