package arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;

        //outer loop manages the passes
        for (int x = 0; x < n - 1; x++) {
            //inner loop do the comparing and bubbling
            for (int y = 0; y < n - x - 1; y++) {
                if (my_array[y] > my_array[y + 1]) {
                    int temp = my_array[y];
                    my_array[y] = my_array[y + 1];
                    my_array[y + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array : ");
        for (int z = 0; z < n; z++) {
            System.out.print(my_array[z] + " ");
        }
    }

}
