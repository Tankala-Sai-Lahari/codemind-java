import java.util.Scanner;
class Capacity{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int ans;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        ans=512*c*b*a*2;
        System.out.println(ans);
        sc.close();
    }
}