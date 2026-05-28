package aisd.homework5;

public class ex4 {
    public static void main(String[] args) {
        int[] a = {2, 5, 7, 11, 15};
        int t = 9;
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int s = a[l] + a[r];
            if (s == t) {
                System.out.println(a[l] + " " + a[r]);
                return;
            } else if (s < t) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println("нет таких");
    }
}