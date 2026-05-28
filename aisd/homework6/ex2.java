package aisd.homework6;

import java.util.Scanner;
import static java.lang.Math.abs;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.println(calcSquare(v1) == v2);
    }
    private static int calcSquare(int num) {
        int x = abs(num);
        int y = abs(num);
        int res = 0;
        while (y != 0) {
            if ((y & 1) != 0) {
                res += x;
            }
            x <<= 1;
            y >>= 1;
        }
        return res;
    }
}