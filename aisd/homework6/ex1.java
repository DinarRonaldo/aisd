package aisd.homework6;

public class ex1 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7};
        int target = 6;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = numbers.length;
        }
        System.out.println(index);
    }
}