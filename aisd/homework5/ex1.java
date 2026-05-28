package aisd.homework5;

import java.util.HashSet;
import java.util.Set;

public class ex1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 5, 6};
        int ans = countUnique(a);
        System.out.println(ans);
    }

    public static int countUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int v : arr) {
            set.add(v);
        }
        return set.size();
    }
}