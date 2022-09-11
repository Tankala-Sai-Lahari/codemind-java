import java.util.Scanner;
class Temp{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    float a;
    float b;
    a=sc.nextFloat();
    b=a*9/5+32;
    System.out.format("%.2f",b);
    sc.close();
}}