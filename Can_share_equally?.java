import java.util.Scanner;
class Share{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if (x%2==0 &&(y%2==0 || x>0 && y>0)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}