import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
        double b = (10000 * w) / (h * h);

        if(b >= 25) {
            System.out.println((int)b);
            System.out.print("Obesity");
        } else {
            System.out.println((int)b);
        }

		
    }
}