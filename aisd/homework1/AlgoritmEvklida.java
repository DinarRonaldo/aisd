package aisd.homework1;
import java.util.Scanner;

public class AlgoritmEvklida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int count = 0;
        if (y > x) {
            int s = x;
            x = y;
            y = s;
        }
        if (x == 0 || y == 0) {
            x = 0;
        } else {
            while (x % y != 0) {
                int temp = x % y;
                x = y;
                y = temp;
                count++;
            }
        }
        if (count > 0) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}