import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = n;

        for(int i = 1; i <= n; i++) {
            div /= i;
            
            if(div < 1) {
                System.out.println(i);
                break;
            }
        }

    }
}