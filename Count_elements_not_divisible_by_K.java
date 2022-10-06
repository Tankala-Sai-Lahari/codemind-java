import java.util.Scanner;
class Divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if (temp%k!=0){
                c+=1;
            }
        }
        sc.close();
        System.out.print(c);
    }
}