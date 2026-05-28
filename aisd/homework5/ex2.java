package aisd.homework5;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 0, 1, 2, 0};
        System.out.println("Исходный массив: " + Arrays.toString(a));
        sortDutch(a);
        System.out.println("Отсортированный: " + Arrays.toString(a));
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void sortDutch(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int left = 0;
        int cur = 0;
        int right = arr.length - 1;
        while (cur <= right) {
            if (arr[cur] == 0) {
                swap(arr, left, cur);
                left++;
                cur++;
            } else if (arr[cur] == 1) {
                cur++;
            } else {
                swap(arr, cur, right);
                right--;
            }
        }
    }
}