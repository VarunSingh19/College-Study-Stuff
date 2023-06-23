// public class QuickSort {
//     public static void partition(int arr[], int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;
//         for (int j = low; j < high; j++) {
//             if (arr[j] < pivot) {
//                 i++;
//                 // swap
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = pivot;
//         arr[high] = temp;
//         return i;
//     }

//     public static void quicksort(int arr[], int low, int high) {
//         if (low < high) {
//             int pidx = partition(arr, low, high);

//             quicksort(arr, low, pidx - 1);
//             quicksort(arr, pidx + 1, high);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 2, 44, 22, 4444, 33 };
//         int n = arr.length;
//         quicksort(arr, 0, n - 1);

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();
//     }
// }





// public class QuickSort {

//     public static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int pivotIndex = partition(arr, low, high);
//             quickSort(arr, low, pivotIndex - 1);
//             quickSort(arr, pivotIndex + 1, high);

//         }
//     }

//     private static int partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;
        
//         for (int j = low; j < high; j++) {
//             if(arr[j] < pivot){
//                 i++;
//                 //now perform swap
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         //swap with pivot
//         i++;
//         int temp = arr[i];
//         arr[i] = pivot;
//         arr[high] = temp;
//         return i; //pivot index
//     }
//     public static void main(String[] args) {
//         int[] arr ={6,3,9,5,2,8};
//         int n=arr.length;
//         quickSort(arr,0,n-1);

//         //print the array
//         for (int j : arr) {
//             System.out.print(j + " ");
//         }
//         System.out.println();
//     }
// }








// public class QuickSort {
//     public static void quicksort(int arr[], int low, int high) {
//         if (low < high) {
//             int pivotIndex = partition(arr, low, high);
//             quicksort(arr, low, pivotIndex - 1);
//             quicksort(arr, pivotIndex+1, high);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 32, 2, 332, 23, 45, 221 };
//         int n = arr.length;
//         quicksort(arr, 0, n - 1);
//         for (int j = 0; j < n;j++) {
//             System.out.print(arr[j] + " ");
//         }
//     }

//         private static int  partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;
        
//         for (int j = low; j < high; j++) {
//             if(arr[j] < pivot){
//                 i++;
//                 //now perform swap
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         //swap with pivot
//         i++;
//         int temp = arr[i];
//         arr[i] = pivot;
//         arr[high] = temp;
//         return i; //pivot index
    
//     }
// }


// QuickSort Understanding The Logic.
// public class QuickSort {

//     public static void quicksort(int arr[], int l, int h) {
//         if (l < h) {
//             int pivotIdx = partition(arr, l, h);
//             quicksort(arr,l, pivotIdx - 1);
//             quicksort(arr,pivotIdx+1, h);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 2, 1, 5, 4, 6, 7 };
//         int n = arr.length;
//         quicksort(arr, 0, n - 1);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//     }
    
//     public static int partition(int arr[], int l, int h) {
//         int pivot = arr[l];
//         int i = l;
//         int j = h;
//         while (i < j) {
//             while (arr[i] <= pivot) {
//                 i++;
//             }
//             while (arr[j] > pivot) {
//                 j--;
//             }
//             // Swap Elements.
//             if (i < j) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         // To Swap The Pivot.
//         int temp = arr[j];
//         arr[j] = arr[l];
//         arr[l] = temp;
//         return j;
//     }
// }
    


// public class QuickSort {
//     public static void quicksort(int arr[], int l, int h) {
//         if (l < h) {
//             int pivotIdx = partition(arr, l, h);
//             quicksort(arr, l, pivotIdx - 1);
//             quicksort(arr, pivotIdx+1, h);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 4, 2, 4, 12, 1, 3, 213, 43, 324, 556, 433,4 };
//         int n = arr.length;
//         quicksort(arr, 0, n - 1);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
    
//     public static int partition(int arr[], int l, int h) {
//         int pivot = arr[l];
//         int i = l;
//         int j = h;

//         while (i <= j) {
//             while (arr[i] < pivot) {
//                 i++;
//             }
//             while (arr[j] > pivot) {
//                 j--;
//             }
//             if (i < j) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[j];
//         arr[j] = arr[l];
//         arr[l] = temp;
//         return j;
//     }
// }












public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 4, 12, 1, 3, 213, 43, 324, 556, 433, 4 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;

        while (i < j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;
        return j;
    }

    public static void quicksort(int arr[], int l, int h) {
        if (l < h) {
            int pivotIdx = partition(arr, l, h);
            quicksort(arr, l, pivotIdx - 1);
            quicksort(arr, pivotIdx + 1, h);
        }
    }
}
































