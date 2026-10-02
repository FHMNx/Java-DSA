package arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Element : ");
        int key = scanner.nextInt();

        int flag = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                System.out.println("Element Found at: " + i);
                flag = 1;
                break;
            }
        }
        
        if(flag != 1){
            System.out.println("Element Not Found");
        }

    }

}

// A searching algorithm
//used with arrays
// fidning location of element
//disadvantage of this linearSearch is ..if there is 10000 values we should search all to find the exact element..
// to fix this issue we can use BinarySearch method
