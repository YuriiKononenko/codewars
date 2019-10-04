package sorting;

public class BubbleSort {

    private static int[] list = new int[]{144, 7, 5, 6, 7, 12, 1, 0, -3, -2, 7, 0, -3, -2, 7};


    private static int[] sort(final int[] initial) {
        var swapFlag = false;
        for (int i = 0; i < initial.length - 1; i++) {
            if (initial[i] > initial[i + 1]) {
                var first = initial[i];
                initial[i] = initial[i + 1];
                initial[i + 1] = first;
                swapFlag = true;
            }
        }
        return swapFlag ? sort(initial) : initial;
    }

    public static void main(String[] args) {
        for (int i : sort(list)) {
            System.out.println(i);
        }
    }

}