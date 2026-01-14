import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int n1 = a * (b % 10);
        int n2 = a * ((b % 100 / 10));
        int n3 = a * (b / 100);
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1 + n2 * 10 + n3 * 100);
    }
}