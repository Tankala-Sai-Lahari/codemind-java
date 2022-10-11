import java.util.Scanner;
class RainDrop{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String st="";
        if (a%3==0){
            st=st+"Pling";
        }
        if (a%5==0){
            st=st+"Plang";
        }
        if (a%7==0){
            st=st+"Plong";
        }
        if(st==""){
            System.out.print(a);
        }
        else{
            System.out.print(st);
        }
    }
}