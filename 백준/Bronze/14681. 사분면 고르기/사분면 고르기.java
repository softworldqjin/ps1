import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        int c = 0;
        
        if (x != 0 && y != 0){
            if (x > 0 && y > 0){
                c = 1;
            } else if (x < 0 && y > 0){
                c = 2;
            } else if (x <0 && y < 0){
                c = 3;
            } else {
                c = 4;
            }
        }
  
        System.out.println(c);
    }
}