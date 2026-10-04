package arrays;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int[] my_array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 110};
        int n = my_array.length;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Key Element : ");
        int key = scanner.nextInt();

        int lowerBound = 0;
        int upperBound = n - 1;

        int flag = 0;
        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (my_array[mid] == key) {
                System.out.println("Element Found At : " + mid);
                flag = 1;
                break;
            } else if (my_array[mid] <= key) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        
        if(flag == 0){
            System.out.println("Element Not Found");
        }

    }

}

//REDUCING THE SEARCH SPACE
// for binary search the array must be in sorted format
