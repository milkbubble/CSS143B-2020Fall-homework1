//Searching 6 in array [1, 3, 6, 8, 9] should return 2 because number 6 appears at index 2.
//Searching 9 in array [1, 3, 6, 8, 9] should return 4.
//Searching 7 in array [1, 3, 6, 8, 9] should return -1 because 7 is not found in this array.
// Searching 6 in array [1, 3, 6, 6, 9] should return 2 because the first 6 appears at index 2.

public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        //sets this integer as 0 for the minimum index
        int min =  0;
        //this serves as the largest index number within the array
        int max = data.length - 1;
        //this while loop works as long as the min integer is not larger than the max int
        while (max >= min) {
            //this determines the median index of the array to cut down numbers to search
            int middle = (max + min) / 2;
            if (target == data[middle]) {
                //this returns the index for the target value if it matches the middle index
                return middle;
            } else if (data[middle] > target) {
                //if the target value is less than the median index it cuts the values to search
                //by searching everything under the median index
                max = middle - 1;
            } else if (data[middle] < target) {
                //if the target value is greater this raises the minimum accordingly.
                min = middle + 1;
            }
        }
        return -1; // Place holder
    }
}

