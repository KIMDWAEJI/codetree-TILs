import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[3];

        for(int i = 1; i <= n; i++) {
            str = Integer.toString(i).split("");
            
            if(i < 10) {
            	if(i % 3 == 0) {
                	System.out.print("0 ");
                } else if(str[0].equals("3") || str[0].equals("6") || str[0].equals("9")) {
                	System.out.print("0 ");
                } else {
                	System.out.print(i + " ");
                }
            }
            
            if(i >= 10) {
            	if(i % 3 == 0) {
                	System.out.print("0 ");
                } else if(str[0].equals("3") || str[0].equals("6") || str[0].equals("9") || str[1].equals("3") || str[1].equals("6") || str[1].equals("9")) {
            		System.out.print("0 ");            		
            	} else {
            		System.out.print(i + " ");            		
            	}
            }
        }

    }
}