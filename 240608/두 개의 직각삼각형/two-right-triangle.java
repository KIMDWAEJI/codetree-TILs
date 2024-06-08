import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for(int z = n - i; z >= 1; z--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}