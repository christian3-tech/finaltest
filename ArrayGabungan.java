public class ArrayGabungan {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3};
        System.out.println("Array 1D:");
        for (int x : a1) System.out.println(x);

        int[][] a2 = {{1, 2}, {3, 4}};
        System.out.println("\nArray 2D:");
        for (int[] r : a2)
            for (int x : r)
                System.out.println(x);

        int[][][] a3 = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        System.out.println("\nArray 3D:");
        for (int[][] b : a3)
            for (int[] r : b)
                for (int x : r)
                    System.out.println(x);
    }
}