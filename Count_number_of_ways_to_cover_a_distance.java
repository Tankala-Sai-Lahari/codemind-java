import java.util.Scanner;

class Count{
    public static int fact(int n){
        if (n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        else{
            return fact(n-1)+fact(n-2)+fact(n-3);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(fact(a));
    }
}