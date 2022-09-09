import java.util.Scanner;
class Area
{
    public static void main(String args[]){
    int rad;
    double ar;
    Scanner sc=new Scanner(System.in);
    rad=sc.nextInt();
    ar=rad*rad;
    ar=ar*3.14;
    System.out.println(ar);
    sc.close();
}
}