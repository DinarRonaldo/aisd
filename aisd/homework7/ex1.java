package aisd.homework7;

public class ex1 {
    public static void main(String[] args) {
        int num = 10946;
        int prev = 1;
        int curr = 1;
        int next = 0;
        while (next < num) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println(num == next);
    }
}