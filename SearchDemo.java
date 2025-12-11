public class SearchDemo {

    // Binary Search
    static int binary(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) return m;
            if (a[m] < x) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    // Interpolation Search
    static int interp(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r && x >= a[l] && x <= a[r]) {
            int pos = l + (x - a[l]) * (r - l) / (a[r] - a[l]);
            if (a[pos] == x) return pos;
            if (a[pos] < x) l = pos + 1;
            else r = pos - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};

        System.out.println("Binary Search: " + binary(data, 40));  // index 3
        System.out.println("Interpolation Search: " + interp(data, 40)); // index 3
    }
}