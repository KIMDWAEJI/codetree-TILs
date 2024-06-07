import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int x = sc.nextInt(), y = sc.nextInt();
            char c = sc.next().charAt(0);

            System.out.println(x * y);

            if(c == 'C') {
                break;
            }
        }

    }
}