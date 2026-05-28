package aisd.homework4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число в " + i + " ячейку массива:");
            int x = sc.nextInt();
            if (i > 0 && x < a[i - 1]) {
                System.out.println("Ошибка: элемент должен быть не меньше предыдущего, введите число заново");
                x = sc.nextInt();
            }
            a[i] = x;
        }
        System.out.println("Массив заполнен, введите число n: ");
        int t = sc.nextInt();
        BinarySearch bs = new BinarySearch();
        int first = bs.findFirst(a, t);
        int last = bs.findLast(a, t);
        System.out.println("Индекс первого вхождения, индекс последнего вхождения: " + first + ", " + last);
        sc.close();
    }
}