package aisd.homework7;

import java.util.Arrays;
public class ex5 {
    public static void main(String[] args) {
        int[] nails = new int[]{0, 10, 11, 12, 13, 20};
        Arrays.sort(nails);
        int len = nails.length;
        int total = 0;
        boolean paired = false;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                total += nails[1] - nails[0];
                paired = true;
            } else if (i == len - 2) {
                total += nails[len - 1] - nails[len - 2];
                break;
            } else if (paired) {
                paired = false;
                continue;
            } else {
                if (nails[i + 1] - nails[i] <= nails[i] - nails[i - 1]) {
                    paired = true;
                    total += nails[i + 1] - nails[i];
                } else {
                    total += nails[i] - nails[i - 1];
                }
            }
        }
        System.out.println(total);
    }
}