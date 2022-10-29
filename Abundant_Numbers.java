import java.util.Scanner;
class Abundent_Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=1;
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if (num%i==0){
                s+=i;
            }
        }
        if(s>num){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}