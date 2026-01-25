import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first_total = input.nextInt();
        int count = input.nextInt();
        
        int second_total = 0;
        for (int i = 0; i < count; i++){
            int price = input.nextInt();
            int quantity = input.nextInt();
            second_total += price * quantity;
        }
        if (first_total == second_total){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}