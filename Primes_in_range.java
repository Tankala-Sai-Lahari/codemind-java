import java.util.Scanner;
class Primes{
    public static boolean isprime(int num){
        if (num<=1){
            return false;
        }
        for(int i=2;i<=Math.pow(num,0.5);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        for(int i=m;i<=n;i++){
            if (isprime(i)){
                c++;
            }
        }
        System.out.print(c);
    }
}