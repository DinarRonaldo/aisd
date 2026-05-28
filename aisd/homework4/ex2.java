package aisd.homework4;

public class ex2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 6, 7, 8};
        int len = arr.length;
        int expectedSum = 0;
        int actualSum = 0;
        int i = 0;
        while (i < len) {
            actualSum += arr[i];
            i++;
        }
        int max = arr[len - 1];
        expectedSum = max * (max + 1) / 2;
        System.out.println(expectedSum - actualSum);
    }
}