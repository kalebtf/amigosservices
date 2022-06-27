package com.amigoscode.customer;

public class FindMissingNumber {


    // Function to find the missing elements
    static void printMissingElements(int arr[],
                                     int N)
    {

        // Initialize diff
        int diff = arr[0] ;

        for(int i = 0; i < N; i++)
        {

            // Check if diff and arr[i]-i
            // both are equal or not
            if (arr[i] - i != diff)
            {

                System.out.print((i + diff) + " ");

                // Loop for consecutive
                // missing elements
//                while (diff < arr[i] - i)
//                {
//                    System.out.print((i + diff) + " ");
//                    diff++;
//                }
            }
        }
    }

    // Driver Code
    public static void main (String[] args)
    {

        // Given array arr[]
        //int arr[] = { 6, 7, 10, 11, 13 };
        int [] arr = {5,6,7,8,9,19,11,12};

        int N = arr.length;

        // Function call
        printMissingElements(arr, N);
    }
}

// This code is contributed by offbeat