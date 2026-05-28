package aisd.homework6;

import java.util.HashSet;
import java.util.Set;

public class ex6 {
    public static Integer findCommon(int[] first, int[] second, int[] third) {
        Set<Integer> setFirst = new HashSet<>();
        for (int val : first) {
            setFirst.add(val);
        }
        Set<Integer> setFirstSecond = new HashSet<>();
        for (int val : second) {
            if (setFirst.contains(val)) {
                setFirstSecond.add(val);
            }
        }
        for (int val : third) {
            if (setFirstSecond.contains(val)) {
                return val;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        int[] y = {2, 4, 6, 8};
        int[] z = {2, 5, 7, 9};
        Integer res = findCommon(x, y, z);
        System.out.println(res);
    }
}