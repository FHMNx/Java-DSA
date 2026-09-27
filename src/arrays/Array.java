package arrays;

public class Array {

    public static void main(String[] args) {
        int[] my_array = {7, 12, 9, 4, 11, 8, 2, 6};
        int minValue = my_array[0];

        for (int x : my_array) {
            if(x < minValue){
                minValue = x;
            }
        }
        
        System.out.println("Lowest value: " + minValue);
    }
}
