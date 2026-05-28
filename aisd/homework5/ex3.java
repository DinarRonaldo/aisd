package aisd.homework5;

import java.util.Arrays;
import java.util.Comparator;

public class ex3 {
    public static void main(String[] args) {
        String[] a = {"BANANA", "Apple", "apple", "banana", "appple", "Apple"};
        Arrays.sort(a, new Comparator<String>() {
            public int compare(String x, String y) {
                int l1 = x.length();
                int l2 = y.length();
                int m = Math.min(l1, l2);
                for (int i = 0; i < m; i++) {
                    if (x.charAt(i) != y.charAt(i)) {
                        return x.charAt(i) - y.charAt(i);
                    }
                }
                return l1 - l2;
            }
        });
        System.out.println(Arrays.toString(a));
    }
}