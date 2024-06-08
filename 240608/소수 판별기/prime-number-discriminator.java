import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        boolean check = true;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && i != 1 && i != n) {
                check = false;
            }
        }

        if(check == true) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }

    }
}