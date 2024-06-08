import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int cnt = 0;

        for(int i = 0; i < 5; i++) {
            int n = sc.nextInt();

            if(n % 3 != 0) {
                check = false;
            }
        }

        if(check == true) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}