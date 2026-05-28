package aisd.homework7;

public class ex3 {
    public static void main(String[] args) {
        String str = "abcdefghij";
        int prev = 1;
        int curr = 1;
        int next = 1;
        System.out.print(str.charAt(0));
        while (prev + curr < str.length()) {
            next = prev + curr;
            prev = curr;
            curr = next;
            System.out.print(str.charAt(next - 1));
        }
    }
}