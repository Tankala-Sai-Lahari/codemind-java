import java.util.Scanner;
class Area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        double s,ar;
        a=sc.nextFloat();b=sc.nextFloat();c=sc.nextFloat();
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
        sc.close();
    }

}