package aisd.homework4;

class BinarySearch {
    public int findFirst(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;
        int pos = -1;

        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (arr[mi] == target) {
                pos = mi;
                hi = mi;
            } else if (arr[mi] < target) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return pos;
    }

    public int findLast(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;
        int pos = -1;

        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (arr[mi] == target) {
                pos = mi;
                lo = mi + 1;
            } else if (arr[mi] < target) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return pos;
    }
}