package recursion;

import java.util.Arrays;

public class RecursiveBinarySearch {

    /*----------------------------------------------------------------------------*/    
    public static int recursion(int[] array, int key, int start, int end ) {

        if (start < end) {
            
            int mid = start + ((end - start) / 2);
            System.out.println("element = " + mid);
            
            if (key < array[mid]) {         // key is smaller than middle
                return recursion(array, key, start, mid);

            } else if (key > array[mid]) {  // key is bigger than middle
                return recursion(array, key, mid + 1, end);

            } else {                        // key is equal to middle
                return mid; 
            }
        }
        
        return -(start + 1); // invalid range
    }

    /*----------------------------------------------------------------------------*/ 
    public static void main(String[] args) {

        int[] array = {4, 3, 2, 6, 9, 1, 5, 0, 7, 8};
        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));

        for(int i=0; i<array.length; i++) {
            int index = recursion(array, array[i], 0, array.length);
            System.out.println("Found "+ array[i] + " at " + index + " index\n");
        }

    }
    /*----------------------------------------------------------------------------*/ 

}
