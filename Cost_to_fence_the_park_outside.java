import java.util.Scanner;
class Fence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        int area=((l+2*w)*(b+2*w))-(l*b);
        System.out.print((int)area*c);
        sc.close();
    }
}