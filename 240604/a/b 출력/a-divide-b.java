import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int n, m;

        System.out.print("0.");

        for(int i = 1; i < 21; i++) {
            n = a * 10 / b;
            m = a * 10 % b;
            System.out.print(n);
            a = m;
        }
		
    }
}