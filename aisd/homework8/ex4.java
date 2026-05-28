package aisd.homework8;

import java.util.HashMap;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int ratio = scanner.nextInt();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        HashMap<Long, Long> leftMap = new HashMap<>();
        HashMap<Long, Long> rightMap = new HashMap<>();
        for (long val : arr) {
            rightMap.put(val, rightMap.getOrDefault(val, 0L) + 1);
        }
        long result = 0;
        for (int idx = 0; idx < size; idx++) {
            long current = arr[idx];
            long count = rightMap.get(current);
            if (count == 1) {
                rightMap.remove(current);
            } else {
                rightMap.put(current, count - 1);
            }
            if (current % ratio == 0) {
                long leftVal = current / ratio;
                long rightVal = current * ratio;
                long leftCnt = leftMap.getOrDefault(leftVal, 0L);
                long rightCnt = rightMap.getOrDefault(rightVal, 0L);
                result += leftCnt * rightCnt;
            }
            leftMap.put(current, leftMap.getOrDefault(current, 0L) + 1);
        }
        System.out.println(result);
    }
}