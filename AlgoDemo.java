public class AlgoDemo {

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

    // Bubble Sort
    static void bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                }
    }

    // Selection Sort
    static void selection(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) min = j;
            int t = a[i]; a[i] = a[min]; a[min] = t;
        }
    }

    // Insertion Sort
    static void insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // Print
    static void print(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] A = {5, 3, 2, 4, 1};
        int[] B = {5, 3, 2, 4, 1};
        int[] C = {5, 3, 2, 4, 1};

        int[] D = {10, 20, 30, 40, 50};

        System.out.println("=== SORTING ===");
        bubble(A);
        selection(B);
        insertion(C);

        System.out.print("Bubble    : "); print(A);
        System.out.print("Selection : "); print(B);
        System.out.print("Insertion : "); print(C);

        System.out.println("\n=== SEARCHING ===");
        System.out.println("Binary(40)       : " + binary(D, 40));
        System.out.println("Interpolation(40): " + interp(D, 40));
    }
}