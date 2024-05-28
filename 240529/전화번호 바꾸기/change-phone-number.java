import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String z = sc.next(), x = sc.next(), y = sc.next();

        System.out.printf("%s-%s-%s", z, y, x);
    }
}