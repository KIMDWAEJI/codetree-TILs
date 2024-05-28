import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        int m = sc.nextInt();
        char s = sc.next().charAt(0);

        if((n >= 19 && c == 'M') || (m >= 19 && s == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
            
    }
}