import java.util.Scanner;
class CLosest_Pallendrome{
    public static boolean pallendrome(int num){
        int temp=num;
        int res=0;
        while(temp>0){
            res=res*10+temp%10;
            temp=temp/10;
        }
    if(num==res){
    return true;}
    return false;
   }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    boolean flag=false;
    int x=0;
    int y=0;
    for(int i=1;i<=a;i++){
        if(pallendrome(a-i)){
            flag=true;
            x=a-i;
        }
        if(pallendrome(a+i)){
            flag=true;
            y=a+i;
        }
        if(flag==true){
            if(x!=0 && y!=0){
            System.out.println(x+" "+y);}
            else if(x!=0&& y==0){
                System.out.println(x);
            }
            else if(x==0&& y!=0){
                System.out.println(y);
            }
            break;
        }
}
}
}