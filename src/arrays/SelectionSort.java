package arrays;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 5, 22, 11, 90, 12};
        int n = my_array.length;

        for (int x = 0; x < n - 1; x++) {
            int min_index = x;
            for (int y = x + 1; y < n; y++) {
                if (my_array[y] < my_array[min_index]) {
                    min_index = y;
                }
            }

            //swapping
            if (min_index != x) {
                int temp = my_array[x];
                my_array[x] = my_array[min_index];
                my_array[min_index] = temp;
            }
        }

        System.out.println(Arrays.toString(my_array));
    }

}
