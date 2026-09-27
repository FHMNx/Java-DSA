package arrays;

public class BubbleSortImprovement {

    public static void main(String[] args) {
        int[] my_array = {7, 3, 9, 12, 11};
        int n = my_array.length;

        for (int x = 0; x < n - 1; x++) {
            boolean swapped = false;
            for (int y = 0; y < n - x - 1; y++) {
                if (my_array[y] > my_array[y + 1]) {
                    int temp = my_array[y];
                    my_array[y] = my_array[y + 1];
                    my_array[y + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
    }

}
