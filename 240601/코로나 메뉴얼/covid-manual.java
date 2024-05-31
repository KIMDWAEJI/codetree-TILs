import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, C = 0, D = 0;

        for(int i = 0; i < 3; i++) {
            char state = sc.next().charAt(0);
            int temp = sc.nextInt();

            if(state == 'Y') {
                if(temp >= 37) {
                    A++;
                } else {
                    C++;
                }
            } else {
                if(temp >= 37) {
                    B++;
                } else {
                    D++;
                }
            }
        }

        if(A >= 2) {
            System.out.print("E");
        } else {
		    System.out.print("N");
        }

    }
}