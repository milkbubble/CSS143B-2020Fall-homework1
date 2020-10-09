public class Problem2 {
    //This function will sort an array in ASCENDING order.
    // Do not change signature (function name, parameters)

    public static void bubbleSort(int[] data) {
        //this statement forces a return if the array is empty or null
        if (data == null || data.length == 0) {
            return;
        }
        //this outer for loop allows the loop to swap larger numbers for smaller ones more than once
        for (int i = 0; i < data.length; i++) {
            //this loop goes through the entire array and swaps whichever large numbers are left adjacent
            //to the smaller ones
            for (int x = 0; x < data.length - 1; x++) {
                //this if statement checks if the number to the right of the one being checked is smaller
                if (data[x + 1] < data[x]) {
                    //this int temporarily stores the array value needing to be swapped
                    int temp = data[x];
                    data[x] = data[x+1];
                    data[x + 1] = temp;
                }
            }

        }
    }
}

