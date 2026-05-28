package aisd.homework6;

import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 1, -4};
        int goal = 1;
        Arrays.sort(numbers);
        int len = numbers.length;
        int nearestSum = numbers[0] + numbers[1] + numbers[2];
        int[] bestTriplet = new int[3];
        for (int idx = 0; idx < len - 2; idx++) {
            int leftPos = idx + 1;
            int rightPos = len - 1;
            while (leftPos < rightPos) {
                int curSum = numbers[idx] + numbers[leftPos] + numbers[rightPos];
                if (curSum == goal) {
                    System.out.print(numbers[idx] + " " + numbers[leftPos] + " " + numbers[rightPos]);
                    return;
                }
                if (Math.abs(curSum - goal) < Math.abs(nearestSum - goal)) {
                    bestTriplet[0] = numbers[idx];
                    bestTriplet[1] = numbers[leftPos];
                    bestTriplet[2] = numbers[rightPos];
                    nearestSum = curSum;
                }
                if (curSum < goal) {
                    leftPos++;
                } else {
                    rightPos--;
                }
            }
        }
        System.out.println(Arrays.toString(bestTriplet));
    }
}