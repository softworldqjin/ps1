import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        
        int result;
        if (n1 == n2 && n2 == n3){
            result = 10000 + (n1 * 1000); 
        } else if (n1 == n2 || n1 == n3 || n2 == n3){
            if (n1 == n2){
                result = 1000 + (n1 * 100);
            } else if (n1 == n3) {
                result = 1000 + (n1 * 100);
            } else {
                result = 1000 + (n2 * 100);
            }
        } else {
            if (n1 > n2 && n1 > n3){
                result = n1 * 100;
            } else if (n2 > n1 && n2 > n3){
                result = n2 * 100;
            } else {
                result = n3 * 100;
            }
        }
        System.out.println(result);
    }
}