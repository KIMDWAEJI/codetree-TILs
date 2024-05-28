import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int mm = sc.nextInt(), dd = sc.nextInt(), yyyy = sc.nextInt();

        System.out.printf("%d.%d.%d", yyyy, mm, dd);
    }
}