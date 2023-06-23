
public class SortingInLang {
    // 2. Selection Sort
    // 3. Insertion Sort

    // -----------------1. Bubble Sort---------------------
    public static void main(String[] args) {
        // Messed Up Array
        int arr[] = { 7, 8, 3, 1, 2 };
        // System.out.println("Array length : "+arr.length);

        // Bubble Sort Method.
        for (int i = 0; i < arr.length - 1; i++) { // This loop will traverse from 0 - 4 which is 5 (length)
            for (int j = 0; j < arr.length - i - 1; j++) { // 0-4 (using indexing) traverse
                if (arr[j] > arr[j + 1]) { //
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the Sorted array.
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // My Attempt.

        int MyArr[] = { 43, 22, 5, 2, 442, 222, 123 };
        for (int i = 0; i < MyArr.length - 1; i++) {
            for (int j = 0; j < MyArr.length - i - 1; j++) {
                if (MyArr[j] > MyArr[j + 1]) {
                    // Swap
                    int temp = MyArr[j];
                    MyArr[j] = MyArr[j + 1];
                    MyArr[j + 1] = temp;
                }
            }
        }
        // System.out.println();
        // System.out.println("After Bubble Sort :");
        // for (int i = 0; i < MyArr.length; i++) {
        // System.out.print(MyArr[i]+" ");
        // }
        //

        // Trying again
        int MyArray[] = { 2, 34, 224, 43, 1, 4, 44, 2 };
        for (int i = 0; i < MyArray.length - 1; i++) {
            for (int j = 0; j < MyArray.length - i - 1; j++) {
                if (MyArray[j] > MyArray[j + 1]) {
                    int temp = MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j + 1] = temp;
                }
            }
        }

        // for (int i = 0; i < MyArray.length; i++) {
        // System.out.print(MyArray[i]+ " ");
        // }
        // ----------------------------------------------------------------------------------------------
        // Selection Sorting.

        // int myData[] = { 2, 34, 21, 32, 44, 3 };
        // for (int i = 0; i < myData.length - 1; i++) {
        //     int smallest = i;
        //     for (int j = i + 1; j < myData.length; j++) {
        //         if (myData[smallest] > myData[j]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = myData[smallest];
        //     myData[smallest] = myData[i];
        //     myData[i] = temp;
        // }
        // for (int i = 0; i < myData.length; i++) {
        // System.out.print(myData[i] + " ");
        // } 

        // ----------------------------------------------------------------------------------------------------------
        // Insertion Sort.
        // int myar[] = { 13, 3, 2, 323, 32 };
        // for (int i = 1; i < myar.length; i++) {
        //     int current = myar[i];
        //     int j = i - 1;
        //     while (j >= 0 && current <= myar[j]) {
        //         myar[j + 1] = myar[j];
        //         j--;
        //     }
        //     myar[j + 1] = current;
        // }

        // for (int i = 1; i < myar.length; i++) {
        //     System.out.print(myar[i] + " ");
        // }

        int MyInsertion[] = { 2, 4, 3, 6, 8, 466, 754, 33 };
        for (int i = 1; i < MyInsertion.length; i++) { //lets say this is a sorted array.
            int current = MyInsertion[i]; //lets current position be the index from 1 -  length.
            int j = i - 1; //j =  1-1 = 0,2-1=1,3-1=2...so on
            while (j >= 0 && current < MyInsertion[j]) {
                //while j is greater then 0 and the current 
                // position is less then the j unsorted array (MyInsertion[j])
                MyInsertion[j + 1] = MyInsertion[j];
                // array of j+1 =  array of j 
                j--;
                // and do the decrement till the while loops condition becomes false.
            }
            MyInsertion[j + 1] = current;
            // placing the j  array  element.
        }

        System.out.println("Sorted Array using Insertion.");
        for (int i = 1; i < MyInsertion.length; i++) {
            System.out.print(MyInsertion[i] + " ");
        }

        // attemt 2:
        // int MyInsertion[] = { 2, 4, 3, 6, 8, 466, 754, 33 };
        //     for (int i = 1; i < MyInsertion.length; i++) {
        //         int current = MyInsertion[i];
        //         int j = i - 1;
        //         while (j >= 0 && current < MyInsertion[j]) {
        //             MyInsertion[j + 1] = MyInsertion[j];
        //             j--;
        //         }
        //         MyInsertion[j + 1] = current;
        //     }
        //     for (int i = 1; i < MyInsertion.length; i++) {
        //     System.out.print(MyInsertion[i]+ " ");
        // }

        // int MyInsertion[] = { 2, 4, 3, 6, 8, 466, 754, 33 };
        // for (int i = 1; i < MyInsertion.length; i++) {
        //     int current = MyInsertion[i];
        //     int j = i - 1;
        //     while (j >= 0 && current < MyInsertion[j]) {
        //         MyInsertion[j + 1] = MyInsertion[j];
        //         j--;
        //     }
        //     MyInsertion[j + 1] = current;
        // }

        // for (int i = 1; i < MyInsertion.length; i++) {
        //     System.out.print(MyInsertion[i]+ " ");
        // }

    }
}



