// public class MergeSort {
//     public static void divide(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = si + (ei - si) / 2;  // Or si + ei / 2 = mid
//         divide(arr, si, mid);
//         divide(arr, mid + 1, ei);
//         conquer(arr, si, mid, ei);
//     }

//     public static void main(String args[]) {
//         int arr[] = { 6, 3, 9, 5, 2, 8 };
//         int n = arr.length;
//         divide(arr, 0, n - 1);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void conquer(int arr[], int si, int mid, int ei) {
//         int merged[] = new int[ei - si + 1];
//         int idx1 = si;
//         int idx2 = mid + 1;
//         int x = 0;
//         while (idx1 <= mid && idx2 <= ei) {
//             if (arr[idx1] <= arr[idx2]) {
//                 // if array of idx1 <=  array of idx2
//                 // {3,6,9} <= {2,5,8}
//                 // 3 <= 2
//                 // 6 <= 5
//                 // 9 <= 8
//                 // (for each)
//                 merged[x++] = arr[idx1++];
//                 // merged[] = {2} at 0 index using int x.(which is basically at 0.)
//             } else {
//                 merged[x++] = arr[idx2++];
//             }
//         }

        
//         while (idx1 <= mid) {
//             merged[x++] = arr[idx1++];
//         }
//         while (idx2 <= ei) {
//             merged[x++] = arr[idx2++];
//         }
//         for (int i = 0, j = si; i < merged.length; i++, j++) {
//             arr[j] = merged[i];
//             // copying new array data to the main array.
//         }
//     }
// }


// My attempt:)  easy or wot...

// public class MergeSort {

//     // <--------------Divide Function.-------------->
//     public static void divide(int array[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = (si + ei) / 2;
//         divide(array, si, mid);
//         divide(array, mid + 1, ei);
//         merge(array, si, mid, ei);
//     }

//     public static void main(String[] args) {
//         // Initialization  or Driver Code.
//         int array[] = { 3, 5, 2, 33, 55, 3333, 78 };
//         int n = array.length;
//         // running the divide funcion.
//         divide(array, 0, n - 1);
//         //lets print.
//         for (int i = 0; i < n; i++) {
//             System.out.print(array[i] + " ");
//         }
//         // System.out.println();
//     }
    
//     // <-------------Merge Function-------------->
//     public static void merge(int array[], int si, int mid, int ei) {
//         int newArray[] = new int[ei - si + 1];
//         int x = 0;
//         int idx1 = si;
//         int idx2 = mid + 1;

//         while (idx1 <= mid && idx2 <= ei) {
//             if (array[idx1] <= array[idx2]) {
//                 newArray[x++] = array[idx1++];
//             } else {
//                 newArray[x++] = array[idx2++];
//             }
//         }

//         while (idx1 <= mid) {
//             newArray[x++] = array[idx1++];
//         }

//         while (idx2 <= ei) {
//             newArray[x++] = array[idx2++];
//         }

//         for (int i = 0, j = si; i < newArray.length; i++, j++) {
//             array[j] = newArray[i];
//         }
//     }
// }




// Full Speed .,


// public class MergeSort {
//     public static void divide(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = (si + ei) / 2;
//         divide(arr, si, mid);
//         divide(arr, mid + 1, ei);
//         merge(arr, si, mid, ei);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 233, 4, 32, 33, 22, 11, 41, 31313131, 131213, 313, 1 };
//         int n = arr.length;
//         divide(arr, 0, n - 1);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
    
//     public static void merge(int arr[], int si, int mid, int ei) {
//         int newArr[] = new int[ei - si + 1];
//         int x = 0;
//         int idx1 = si;
//         int idx2 = mid + 1;

//         while (idx1 <= mid && idx2 <= ei) {
//             if (arr[idx1] < arr[idx2]) {
//                 newArr[x++]=arr[idx1++];
//             } else {
//                 newArr[x++] = arr[idx2++];
//             }
//         }

//         while(idx1<=mid){
//             newArr[x++]=arr[idx1++];
//         }
//         while(idx2<=ei){
//             newArr[x++]=arr[idx2++];
//         }

//         for(int i=0,j=si;i<newArr.length;i++,j++){
//             arr[j]=newArr[i];
//         }
//     }
// }


public class MergeSort {

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 71, 14, 16,11, 92, 4, 2 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void merge(int arr[], int si, int mid, int ei) {
        int newarray[] = new int[ei - si + 1];
        int x = 0;
        int idx1 = si;
        int idx2 = mid + 1;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                newarray[x++] = arr[idx1++];
            } else {
                newarray[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            newarray[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            newarray[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < newarray.length; i++, j++) {
            arr[j] = newarray[i];
        }
    }
}

























