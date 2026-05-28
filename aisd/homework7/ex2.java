package aisd.homework7;

public class ex2 {
    public static void main(String[] args) {
        int n = 7 % 60;
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 0; i < n - 2; i++) {
            c = (a + b) % 10;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
