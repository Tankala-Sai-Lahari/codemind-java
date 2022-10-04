import java.util.Scanner;
class Cons{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.nextLine().charAt(0);
        if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' ||a=='E'||a=='I'||a=='O'||a=='U'){
        System.out.printf("Vowel");
        }
        else{
        System.out.printf("Consonant");
        }
        sc.close();
    }
}