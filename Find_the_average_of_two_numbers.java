import java.util.Scanner;
class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a,b;
        float c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(a+b)/2;
        System.out.format("%.4f",c);
        sc.close();
    }
}